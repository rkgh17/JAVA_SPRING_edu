package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController_EX07 {
	
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
	public String checkUser(HttpServletRequest req, Model model) { // url로 파라미터를 전달받음
		System.out.println("checkUser called");
		String loginId = req.getParameter("loginid");
		String pw = req.getParameter("passcode");
//	public String checkUser(Member member, Model model) { //멤버 클래스 사용
//		String loginId = member.getLoginid();
//		String pw = member.getPw();
		if(!loginId.equals("a") || !pw.equals("a")) {
			return "redirect:/login";
		}
		
		model.addAttribute("loginid", loginId);
		model.addAttribute("passcode", pw);
		return "logininfo";
	}
	
	@RequestMapping("/login_post") // post방식
	public String login_post() {
		System.out.println("login called");
		return "login_post";
	}
	
	@RequestMapping("/checkUser_post")
	public String checkUser_post(HttpServletRequest req, Model model) { // url로 파라미터를 전달받음
		System.out.println("checkUser called");
		String loginId = req.getParameter("loginid");
		String pw = req.getParameter("passcode");

		if(!loginId.equals("a") || !pw.equals("a")) {
			return "redirect:/login";
		}
		
		model.addAttribute("loginid", loginId);
		model.addAttribute("passcode", pw);
		return "logininfo_post";
	}
	
	@RequestMapping("/multiple")
	public String multiple() {
		System.out.println("multiple called");
		return "multiple";
	}
	
	@RequestMapping("/multiple_result")
	public String multiple_result(HttpServletRequest req, Model model) {
		System.out.println("result called");
		String multi = req.getParameter("dan");
		
		model.addAttribute("dan", multi);
		return "multiple_result";
	}
	
	@RequestMapping("/multiple2")
	public String multiple2() {
		System.out.println("multiple2 called");
		return "multiple2";
	}
	
	@RequestMapping("/multiple_result2")
	public ModelAndView multiple_result2(HttpServletRequest req, Model model) {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		int dan=Integer.parseInt(req.getParameter("dan"));
		String result="------------<br>";
		list.add(result);
		
		for (int i = dan ; i<10 ; i++) {
			for(int j = 2 ; j<10 ; j++) {
				result=(i+" * "+j+" = "+(i*j)+"<br>");
				list.add(result);
			}
			result="------------<br>";
			list.add(result);
		}
		mv.addObject("lists",list);
		mv.setViewName("multiple_result2");
		
		return mv;
	}
	
	// REST API
	@RequestMapping("/gugudan")
	public String gugudan() {
		System.out.println("gugudan called");
		return "gugudan";
	}
	
	@RequestMapping("/showDan/{dan}")
	public String showDan(@PathVariable String dan, Model model) {
		int n=Integer.parseInt(dan);
		if(n<2 || n>9) {
			return "redirect:/gugudan";//유효성 검사
		}
		String result="";
		for (int i = 1 ; i<10 ; i++) {
			result=result+(n+" * "+i+" = "+(n*i)+"<br>");
		}
		model.addAttribute("dan", n);
		model.addAttribute("result", result);
		return "showDan";
	}
	
	
	
	@RequestMapping("/test3/{fruit}/{flower}")
	public String resttest(@PathVariable String fruit, @PathVariable String flower, Model model) {
		model.addAttribute("fruit", fruit);
		model.addAttribute("flower", flower);
		return "RESTAPITest";
		
	}
	
}

/*


client -< Web Server 데이터 전송
1. form 태그 in HTML
2. QueryString
3. AJAX



데이터 받는 여러방법
1.
@RequestMapping("/URL")
public String method1(HttpServletRequest req, ...) {
	String _name = req.getParameter("name");
}

2.
@RequestMapping("/URL")
public String method2(@RequetParam("name") String _name, ...) {
}

3.
@RequestMapping("/URL")
public String method3(Member member, ...) {
} -> 커맨드 객체를 만들어줘야 함.

*/