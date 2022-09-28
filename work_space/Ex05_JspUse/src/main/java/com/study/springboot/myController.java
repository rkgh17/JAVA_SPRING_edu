package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "JSP in Gradle"; //문자열 리턴
	}
	
	@RequestMapping("/test1") // localhost:8081/test1
	public String test1() {
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
