package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController_EX10 {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Validator(2)";
	}
	
	@RequestMapping("/insertForm")
	public String insert1(){
		return "createPage";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") ContentDto contentDto, BindingResult result) {
												/* ContentDto -> Object
												 * BindingResult -> Errors
												 * ContentValidator.java - 형변환됨
												*/ 
		String page = "createDonePage";
		System.out.println(contentDto);
		
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
//		if(result.hasErrors()) {
//			page = "createPage";
//		}
		if(result.hasErrors()) {
			System.out.println("getAllErrors : "+result.getAllErrors());
			
			if(result.getFieldError("writer") != null) {
				System.out.println("1 : "+result.getFieldError("writer").getCode());
			}
			if(result.getFieldError("content") != null) {
				System.out.println("2 : "+result.getFieldError("content").getCode());
			}
			page = "createPage";
		}
		return page;
	}
}