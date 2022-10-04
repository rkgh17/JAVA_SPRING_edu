package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto {
	private int id;
	
	@NotNull(message="아이디를 입력하세요.")
	@NotEmpty(message="아이디를 입력하세요.")
	@Size(min=3, max=10, message="아이디는 3~10자리")
	private String userid;
	
	private String loginid;
	
	@NotNull(message="비밀번호를 입력하세요")
	@NotEmpty(message="비밀번호를 입력하세요")
	private String userpasscode;
	
	private String loginpasscode;
	
	@NotNull(message="실명을 입력하세요.")
	@NotEmpty(message="실명을 입력하세요.")
	private String name;
	
	@NotNull(message="핸드폰 번호를 입력하세요.")
	@NotEmpty(message="핸드폰 번호를 입력하세요.")
	private String mobile;
	private String error_message;
}
