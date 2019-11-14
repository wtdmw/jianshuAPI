package com.qf.jianshu.controller;

import com.qf.jianshu.entity.User;
import com.qf.jianshu.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody @Valid User user, BindingResult bindingResult) {
//        System.out.println("addUser");
        Map<String, Object> addUserMap = new HashMap<>();
//        System.out.println(user);
        //参数校验
        if (bindingResult.hasErrors()) {
            //获取第一个校验失败的错误下信息
            //bindingResult.getFieldError();
            return new ResponseEntity<>(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage(), HttpStatus.FORBIDDEN);
        }

        //添加用户
        String createUser = userService.createUser(user);
        addUserMap.put("message", createUser);
        //业务错误
        if (!createUser.equals("ok")) {
            return new ResponseEntity<>(addUserMap, HttpStatus.FORBIDDEN);
        }

        addUserMap.put("data", "注册成功");
        return new ResponseEntity<>(addUserMap, HttpStatus.OK);
    }



}
