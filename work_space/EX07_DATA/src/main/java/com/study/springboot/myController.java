package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "EX07";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("login called");
		return "login";
	}
	
	@RequestMapping("/checkUser")
	public String chekUser(HttpServletRequest req, Model model) {
		System.out.println("checkUser called");
		String loginId = req.getParameter("loginid");
		String pw = req.getParameter("passcode");
		
		model.addAttribute("loginid", loginId);
		model.addAttribute("passcode", pw);
		return "logininfo";
	}
	
	@RequestMapping("/multiple")
	public String multiple() {
		System.out.println("multiple called");
		return "multiple";
	}
	
	@RequestMapping("/multiple_result")
	public String multiple_result(HttpServletRequest rq, Model md) {
		System.out.println("result called");
		String mul = rq.getParameter("dan");
		
		md.addAttribute("dan", mul);
		return "multiple_result";
	}
	
}

/*


client -< Web Server 데이터 전송
1. form 태그 in HTML
2. QueryString
3. AJAX

*/