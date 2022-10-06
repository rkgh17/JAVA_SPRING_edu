package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MenuDTO;
import com.study.springboot.jdbc.iCafe;

@Controller
public class MyController {
	
	@Autowired
	private iCafe cafe;
	@RequestMapping("/")
	public @ResponseBody String root() {return "CafeManagemen";}
	@RequestMapping("/menu")
	public String doMenu() {return "menu";}
	@RequestMapping("/order")
	public String doOrder() {return "order";}
	@RequestMapping("/sales")
	public String doSales() {return "sales";}
	
	@RequestMapping("/loadMenu")
	@ResponseBody
	public String doLoadMenu() {
//		System.out.println("doLoadMenu");
		ArrayList<MenuDTO> mdto = cafe.loadMenu();
//		System.out.println("JSONArray making");
		JSONArray ja = new JSONArray();
//		System.out.println(mdto.size());
		for(int i=0; i<mdto.size();i++) {
			JSONObject jo = new JSONObject();
			jo.put("id",mdto.get(i).getId());
			jo.put("name",mdto.get(i).getName());
			jo.put("price",mdto.get(i).getPrice());
			ja.add(jo);
		}
//		System.out.println("ja"+ja.size());
		return ja.toJSONString();
	}
	
	@RequestMapping("/addMenu")
	@ResponseBody
	public String doAddMenu(HttpServletRequest req){
//		String name=;
//		int price=;
		cafe.addMenu(req.getParameter("name"), Integer.parseInt(req.getParameter("price")));
		return "ok";//자바스크립트의 함수를 실행시키기 위해
	}
	
	@RequestMapping("/deleteMenu")
	@ResponseBody
	public String doDeleteMenu(HttpServletRequest req) {
		cafe.deleteMenu(Integer.parseInt(req.getParameter("id")));
		return "ok";
	}
	
	@RequestMapping("/updateMenu")
	@ResponseBody
	public String doUpdateMenu(HttpServletRequest req) {
		cafe.updateMenu(Integer.parseInt(req.getParameter("id")), req.getParameter("name"), Integer.parseInt(req.getParameter("price")));
		return "ok";
	}
}
