package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "JSP in Gradle"; //문자열 리턴
	}
	
	@RequestMapping("/test1") // localhost:8081/test1
	public String test1(Model model) { // 파라미터 전달 - from server to client
		model.addAttribute("name","Hwang Ji Hoon");
		model.addAttribute("gender","Male");
		model.addAttribute("age",27);
		return "test1"; // 실제 호출 될 /WEB-INF/view/test1.jsp
	}
	
	@RequestMapping("/test2") // localhost:8081/sub/test2
	public String test2() {
		return "sub/test2"; // 실제 호출 될 /WEB-INF/view/sub/test2.jsp
	}
	
	@RequestMapping("/mt") // localhost:8081/test1
	public String mt() {
		return "mt"; // 실제 호출 될 /WEB-INF/view/test1.jsp
	}
}
