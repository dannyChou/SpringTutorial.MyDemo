package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserController
 */
@Controller
public class UserController {

    private String message = "鐵人賽第七天加油!!!";

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        return "index";
    }  

}