package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyDAO {
	ArrayList<MyDTO> list();
	void insert(String caption, String str, String author);
	bbsDTO view(int bbsid); // 한 행만 가져오면 되므로
}
