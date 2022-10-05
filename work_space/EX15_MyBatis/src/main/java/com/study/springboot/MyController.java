package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MyDAO;

@Controller
public class MyController {
	
	@Autowired
	private MyDAO mydao;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Web is working well";
	}
	
	@RequestMapping("/list")
	public String showList(Model model) {
		model.addAttribute("list",mydao.list());
		return "list";
	}

}
