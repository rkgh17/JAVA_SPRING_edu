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
	private String writer;
	@NotNull(message="비밀번호를 입력하세요")
	@NotEmpty(message="비밀번호를 입력하세요")
	private String content;
	private String error_message;
}
