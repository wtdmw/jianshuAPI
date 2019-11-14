package com.qf.jianshu.controller;

import com.qf.jianshu.entity.LoginInfo;
import com.qf.jianshu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid LoginInfo loginInfo, BindingResult bindingResult) {
        Map<String, Object> loginInfoMap = new HashMap<>();
//        System.out.println("login");
//        System.out.println(loginInfo);

        //参数校验
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage(), HttpStatus.FORBIDDEN);
        }

        //登录
        Map login = loginService.login(loginInfo);

        //业务错误
        if (!login.get("status").equals("ok")) {
            loginInfoMap.put("message", login.get("status"));
            return new ResponseEntity<>(loginInfoMap, HttpStatus.FORBIDDEN);
        }

        loginInfoMap.put("data", login.get("user"));
        loginInfoMap.put("token", login.get("token"));
        return new ResponseEntity<>(loginInfoMap, HttpStatus.OK);
    }

    @PostMapping("/test/sss")
    public ResponseEntity<Object> test(@RequestBody LoginInfo loginInfo, @RequestHeader(name = "nickName") String nickName) {
        Map<String, Object> loginInfoMap = new HashMap<>();
//        System.out.println("test");
//        System.out.println(nickName);
//        System.out.println(loginInfo);

        loginInfoMap.put("data", "666");
        return new ResponseEntity<>(loginInfoMap, HttpStatus.OK);
    }

}


