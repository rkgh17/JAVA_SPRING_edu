package com.study.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/mv") // localhost:8081/mv
	public ModelAndView test2() { // 모델 파라미터 전달ver2
		ModelAndView mv = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grape");
		list.add("Peach");
		
		mv.addObject("lists",list);
		mv.addObject("names","사과,포도,복숭아");
		mv.setViewName("test2");
		
		return mv; // 실제 호출 될 /WEB-INF/view/mv.jsp
	}
	
	@RequestMapping("/mt") // localhost:8081/mt
	public String mt() {
		return "mt"; // 실제 호출 될 /WEB-INF/view/mt.jsp
	}
	
	@RequestMapping("/test2") // localhost:8081/test2
	public String test1_2() {
		return "/sub/test2"; // 실제 호출 될 /WEB-INF/view/sub/test2.jsp
	}
}
