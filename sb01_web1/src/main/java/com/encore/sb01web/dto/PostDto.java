package com.encore.sb01web.dto;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/*
	JSON 예시 // 스네이크 스타일 표기법
	{
		"account" : "주현성",
		"email" : "encore@sw.or.kr",
		"address" : "서울 연희동",
		"password" : "1004",
		"phone_number" : "010-1111-1111",
		"OPT" : "OPT"
	}
 */

@Data
public class PostDto {
	
	private String account;
	private String email;
	private String address;
	private String password;
	
	@JsonProperty("phone_number") // 카멜스타일 표기법으로 되어 있는 것을 스네이크 형식으로 변경하는 법
	private String phoneNumber; 
	
	@JsonProperty("opt") // 카멜도 아니고 스네이크도 아닌 것들은 @JsonPorperty 사용해서 인식시킨다.
	private String OPT; 
}
