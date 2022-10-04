package com.study.springboot;

import javax.validation.Valid;
import javax.validation.Validator;

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
	
	@RequestMapping("/loginForm")
	public String insert1(){
		return "loginForm";
	}
	

	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result, Model model) {
		String page = "createDonePage";
		
		String errmsg="";
		contentDto.setUserid("aaa");
		contentDto.setUserpasscode("1234");
		contentDto.setMobile("1111");
		contentDto.setName("AAA");
		
		contentDto.setLoginid("");
		contentDto.setLoginpasscode("");
		
		System.out.println(contentDto);
		

		if(result.hasErrors()) {
			if((contentDto.getLoginid().equals(contentDto.getUserid())) && (contentDto.getLoginpasscode().equals(contentDto.getUserpasscode()))) {
				return "createDonePage";
			}
			return "loginForm";
		}
		
		
		if(contentDto.getLoginid()!= contentDto.getUserid()) {
			errmsg="아이디가 존재하지 않습니다.<br>";
			System.out.println(errmsg);
			return "loginForm";
		}
		if(contentDto.getLoginpasscode()!= contentDto.getUserpasscode()) {
			errmsg="비밀번호가 존재하지 않습니다.<br>";
			System.out.println(errmsg);
			return "loginForm";
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
		String errmsg="";
		contentDto.setLoginid("a");
		contentDto.setLoginpasscode("b");
		System.out.println(contentDto);
		
		
		if(result.hasErrors()) {
			if(result.getFieldError("userid")!=null) {
				System.out.println("1 : "+result.getFieldError("userid").getDefaultMessage());
				errmsg+=(result.getFieldError("userid").getDefaultMessage()+"<br>");
			}
			if(result.getFieldError("userpasscode")!=null) {
				System.out.println("2 : "+result.getFieldError("userpasscode").getDefaultMessage());
				errmsg+=(result.getFieldError("userpasscode").getDefaultMessage()+"<br>");
			}
			model.addAttribute("error_message",errmsg);		
			page = "signupPage";
		}
		return page;
	}
	
}
