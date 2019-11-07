package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserController
 */
@Controller
public class UserController {

    @RequestMapping("/MyFirstPage")
    public String greeting(@RequestParam(value="title", required=false, defaultValue="鐵人賽 加油!") String title, Model model) {
        model.addAttribute("name", title);
        return "index";
    }  
    
}