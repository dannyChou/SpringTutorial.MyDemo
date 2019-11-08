package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Model.MemberAccount;
import com.example.Service.MemberService;

@Controller
public class MemberController {
	//透過 @RequestMapping 指定從/會被對應到此addMemberPage()方法
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	@GetMapping("/addMemberPage")
    public String addMemberPage(){
//    	memberAccount = new MemberAccount();
//    	memberService.addMember(memberAccount);

        return "addMemberPage";
	}
	
}