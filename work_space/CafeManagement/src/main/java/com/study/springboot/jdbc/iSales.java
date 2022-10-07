package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface iSales {
	ArrayList<SalesDTO> getSalesList(String start, String end);
	int getTotal(String start, String end);

}
