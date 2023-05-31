package com.spring.note;

import java.text.SimpleDateFormat;
import java.util.Date;

public class note {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		String strFormatter = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		
		System.out.println(now);
//		System.out.println(System.currentTimeMillis());
//		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(strFormatter);
		
		
		
	}
	
}
