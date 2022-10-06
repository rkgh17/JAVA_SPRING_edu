package com.study.springboot.jdbc;


import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface iCafe {
	ArrayList<MenuDTO> loadMenu();
	void addMenu(String name, int price);
}
