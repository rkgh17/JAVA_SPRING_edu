package com.study.springboot.jdbc;

import lombok.Data;

@Data
public class bbsDTO {
	
	private int id;
	private String title;
	private String content;
	private String writer;
	private String created;

}
