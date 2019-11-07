package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Service.UserService;

/**
 * UserController
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    private String message = "鐵人賽第七天加油!!!";

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        model.put("ID",userService.getUserId());
        return "MyDemo/index";
    }  

}