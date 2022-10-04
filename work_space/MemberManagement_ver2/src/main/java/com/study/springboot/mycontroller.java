package com.study.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
	
	@RequestMapping("/")
	public String root(){
		return "home";
	}
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest req){
		HttpSession session=req.getSession();
		if(session.getAttribute("userid")==null) {
			return "redirect:/signon";
		}
		return "login";
	}
	

	@RequestMapping("/doLogin")
	public String doLogin(HttpServletRequest req, Model model) {

		String loginid=req.getParameter("loginid");
		String passcode=req.getParameter("passcode");
		HttpSession session=req.getSession();
		System.out.println(loginid);
		System.out.println(passcode);
		
		if(loginid.equals(session.getAttribute("userid")) && passcode.equals(session.getAttribute("passcd"))) {
			model.addAttribute("loginid",loginid);
			model.addAttribute("passcode",passcode);
			return "loginOK";
		}
		return "redirect:/login";
	}
	
	@RequestMapping("/signon")
	public String signon() {
		return "signon";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest req, Model model) {
		HttpSession session=req.getSession();
		
		String loginid=req.getParameter("loginid");
		String passcode=req.getParameter("passcode");
		String passcode1=req.getParameter("passcode1");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		if(!passcode.equals(passcode1)) {
			return "redirect:/signon";
		}
		session.setAttribute("userid", loginid);
		session.setAttribute("passcd", passcode);
		
		model.addAttribute("loginid",loginid);
		model.addAttribute("passcode",passcode);
		model.addAttribute("name",name);
		model.addAttribute("mobile",mobile);
		
		return "signonOK";
		
	}
		
	
}
