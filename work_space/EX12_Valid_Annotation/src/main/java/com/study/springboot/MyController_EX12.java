package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController_EX12 {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "12";
	}
	
	@RequestMapping("/insertForm")
	public String insert1(){
		return "createPage";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result, Model model) {
		String page = "createDonePage";
		System.out.println(contentDto);
		String errmsg="";
		
		if(result.hasErrors()) {
			if(result.getFieldError("writer")!=null) {
				System.out.println("1 : "+result.getFieldError("writer").getDefaultMessage());
				errmsg+=result.getFieldError("writer").getDefaultMessage();
			}
			if(result.getFieldError("content")!=null) {
				System.out.println("2 : "+result.getFieldError("content").getDefaultMessage());
				errmsg+=result.getFieldError("content").getDefaultMessage();
			}
			model.addAttribute("error_message",errmsg);
//			xxx.setError_message(errmsg);
			page = "createPage";
		}
		return page;
	}
}
