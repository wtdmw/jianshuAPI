package com.qf.jianshu.filter;

import com.alibaba.fastjson.JSON;
import com.qf.jianshu.util.TokenUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

@Component
public class ServletFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("拦截器");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;


        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
        rep.setHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        rep.setHeader("Access-Control-Allow-Methods", "POST,PUT,GET, OPTIONS, DELETE");
        rep.setHeader("Access-Control-Max-Age", "3600");
        rep.setHeader("Access-Control-Allow-Headers", "token,Origin, X-Requested-With, Content-Type, Accept");
        rep.setHeader("Access-Control-Allow-Credentials", "true");
        boolean isFilter = false;
        String nickName = "null";
        String method = ((HttpServletRequest) request).getMethod();
        //登录注册请求
        String requestURI = req.getRequestURI();
//        System.out.println(requestURI);
        //放行
        if (requestURI.equals("/login") || requestURI.equals("/user/addUser")) {
            if (method.equals("OPTIONS")) {
                rep.setStatus(HttpServletResponse.SC_OK);
                return;
            }
//            System.out.println("放行");
            chain.doFilter(req, rep);
        } else {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");

            if (method.equals("OPTIONS")) {
                rep.setStatus(HttpServletResponse.SC_OK);
            } else {

                //获取token 验证token
                Cookie[] cookie = req.getCookies();
                if (cookie != null) {
//                    System.out.println("以获取cookie");
                    for (Cookie cook : cookie) {
                        System.out.println(cook.getName() + cook.getValue());
                        if (cook.getName().equalsIgnoreCase("token")) { //获取键 

//                            System.out.println(cook.getValue());
                            //验证token是否过期
                            Boolean tokenExpired = new TokenUtil().isTokenExpired(cook.getValue());

                            if (!tokenExpired) {
                                //获取token中的用户名
                                nickName = new TokenUtil().getUsernameFromToken(cook.getValue());
                                isFilter = true;
                            }
                        }
                    }
                }

                if (isFilter) {
//                    System.out.println("token验证成功");

                    HeaderMapRequestWrapper requestWrapper = new HeaderMapRequestWrapper(req);
                    //依据你自己的业务通过userId获取userName
                    requestWrapper.addHeader("nickName", nickName);

                    chain.doFilter(requestWrapper, response);
                } else {
//                    System.out.println("token验证失败");
                    rep.sendError(401, "未登录");
                    PrintWriter writer = null;
                    OutputStreamWriter osw = null;

                    osw = new OutputStreamWriter(response.getOutputStream(), "UTF-8");
                    writer = new PrintWriter(osw, true);

                    Map<String, String> map = new HashMap<String, String>();
                    map.put("message", "未登录");

                    String jsonStr = JSON.toJSONString(map);

                    writer.write(jsonStr);
                    writer.flush();
                    writer.close();
                    osw.close();
                }
            }
        }

    }

    public static class HeaderMapRequestWrapper extends HttpServletRequestWrapper {

        public HeaderMapRequestWrapper(HttpServletRequest request) {
            super(request);
        }

        private Map<String, String> headerMap = new HashMap<String, String>();

        public void addHeader(String name, String value) {
            headerMap.put(name, value);
        }

        @Override
        public String getHeader(String name) {
            String headerValue = super.getHeader(name);
            if (headerMap.containsKey(name)) {
                headerValue = headerMap.get(name);
            }
            return headerValue;
        }

        @Override
        public Enumeration<String> getHeaderNames() {
            List<String> names = Collections.list(super.getHeaderNames());
            for (String name : headerMap.keySet()) {
                names.add(name);
            }
            return Collections.enumeration(names);
        }

        @Override
        public Enumeration<String> getHeaders(String name) {
            List<String> values = Collections.list(super.getHeaders(name));
            if (headerMap.containsKey(name)) {
                values.add(headerMap.get(name));
            }
            return Collections.enumeration(values);
        }
    }

}
