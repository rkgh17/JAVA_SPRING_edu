package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return ContentDto.class.isAssignableFrom(clazz); //검증할 객체의 클래스 타입 정보
	}

	@Override
	public void validate(Object target, Errors errors) { // 유효성 검사 코드
		ContentDto dto = (ContentDto) target;
		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) { // 사용자가 없거나 비어있다
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "trouble");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"writer"/*커맨드객체의 필드명*/,"writer is empty.");
		String sWriter = dto.getWriter();
		if(sWriter.length() < 3) {
			errors.rejectValue("writer","writer is too short");
		}
		
//		
//		String sContent = dto.getContent();
//		if(sContent == null || sContent.trim().isEmpty()) { // 내용이 없거나 비어있다
//			System.out.println("Content is null or empty");
//			errors.rejectValue("Content", "trouble");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"content","content is empty.");
	}

}
