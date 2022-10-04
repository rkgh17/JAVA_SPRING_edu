package com.study.springboot;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg0) {
		return ContentDto.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto)obj;
		
		String sloginid=dto.getLoginid();
		String sloginpasscode=dto.getLoginpasscode();
		if(sloginid==null || sloginid.trim().isEmpty()) {
			System.out.println("아이디 null or empty");
			errors.rejectValue("loginid", "trouble");
		}
		if(sloginpasscode==null || sloginpasscode.trim().isEmpty()) {
			System.out.println("비밀번호 null or empty");
			errors.rejectValue("loginpasscode", "trouble");
		}
	}
}
