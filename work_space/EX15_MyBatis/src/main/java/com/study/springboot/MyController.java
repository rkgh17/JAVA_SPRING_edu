package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MyDAO;
import com.study.springboot.jdbc.bbsDTO;

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
	
	@RequestMapping("/insertForm")
	public String insertForm() {
		return "insert";
	}
	
	@RequestMapping("/insert")
	public String insert(HttpServletRequest req) {
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		String writer=req.getParameter("writer");
		mydao.insert(title, content, writer);
		return "redirect:/list";
	}
	
	@RequestMapping("/view/{id}")
	public String view(@PathVariable int id, Model model) {
//		int bbsid= Integer.parseInt(id);
//		bbsDTO bdto = mydao.view(bbsid);
//		model.addAttribute("post",bdto); or
		model.addAttribute("post",mydao.view(id));
		return "view";	
	}
	
	@RequestMapping("/delete/{id}")
	public String view(@PathVariable int id) {
		mydao.delete(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/updateForm/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		model.addAttribute("post",mydao.view(id));
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String title = req.getParameter("title");
		String content=req.getParameter("content");
		String writer=req.getParameter("writer");
		mydao.update(id, title, content, writer);
		return "redirect:/list";
	}
}
