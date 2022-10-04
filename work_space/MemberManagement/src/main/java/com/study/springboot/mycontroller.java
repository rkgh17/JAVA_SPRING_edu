package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {
	
	@RequestMapping("/a")
	public @ResponseBody String root() throws Exception{
		return "index";
	}
	
	@RequestMapping("/insertForm")
	public String insert1(){
		return "loginForm";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result, Model model) {
		String page = "createDonePage";
		System.out.println(contentDto);
		String errmsg="";
		
		if(result.hasErrors()) {
			if(result.getFieldError("loginid")!=null) {
				System.out.println("1 : "+result.getFieldError("loginid").getDefaultMessage());
				errmsg+=result.getFieldError("loginid").getDefaultMessage();
			}
			if(result.getFieldError("loginpasscode")!=null) {
				System.out.println("2 : "+result.getFieldError("loginpasscode").getDefaultMessage());
				errmsg+=result.getFieldError("loginpasscode").getDefaultMessage();
			}
			model.addAttribute("error_message",errmsg);
//			xxx.setError_message(errmsg);
			page = "loginForm";
		}
		return page;
	}
	
	@RequestMapping("/signup")
	public String insert3() {
		return "signupPage";
	}
	
	@RequestMapping("/register")
	public String insert4(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result, Model model) {
		String page = "registerPage";
		System.out.println(contentDto);
		String errmsg="";
		
		if(result.hasErrors()) {
			if(result.getFieldError("userid")!=null) {
				System.out.println("1 : "+result.getFieldError("userid").getDefaultMessage());
				errmsg+=result.getFieldError("userid").getDefaultMessage();
			}
			if(result.getFieldError("userpasscode")!=null) {
				System.out.println("2 : "+result.getFieldError("userpasscode").getDefaultMessage());
				errmsg+=result.getFieldError("userpasscode").getDefaultMessage();
			}
			model.addAttribute("error_message",errmsg);
//			xxx.setError_message(errmsg);
			page = "registerPage";
		}
		return page;
	}
	
}
