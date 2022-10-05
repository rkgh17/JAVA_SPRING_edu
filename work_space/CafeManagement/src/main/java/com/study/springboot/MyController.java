package com.study.springboot;

import java.util.ArrayList;

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
	public @ResponseBody String root() {
		return "CafeManagement";
	}
	
	@RequestMapping("/menu")
	public String doMenu() {
		return "menu";
	}
	
	@RequestMapping("/loadMenu")
	@ResponseBody
	public String doLoadMenu() {
		ArrayList<MenuDTO> mdto = cafe.loadMenu();
		JSONArray
		JSONObject
		
	}
}
