package com.study.springboot.jdbc;

import lombok.Data;

@Data
public class orderDTO {
	private String menu;
	private int qty;
	private int price;
	private String mobile;
}
