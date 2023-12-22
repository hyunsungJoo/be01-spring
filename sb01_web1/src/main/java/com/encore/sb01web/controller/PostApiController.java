package com.encore.sb01web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.sb01web.dto.PostDto;

/*
 	String : value
 	nuber : value
 	object : value { }
 	array : value [ ]
 	
 	{
 		"phone_number" : "010-1111-1111",
 		"age" : 10,
 		"isAgree" : false,
 		"account" : {
 				"email" : "aaa@naver.com",
 				"password : "1234"
 		}
 		
 	}
 	
 	// user 조회 하는 경우
 	 {
 	  	"user_list" : [
 	  		{
 	  			"account" : "joo",
 	  			"password" : "1234"
 	  		},
 	  		{
 	  			"account" : "aaa",
 	  			"password" : "1111"
 	  		},
 	  		{
 	  			"account" : "bbb",
 	  			"password" : "2222"
 	  		}
 	  	]
 */

@RestController
@RequestMapping("/api") // POST, http://localhost:8080/api
public class PostApiController {
	
	@PostMapping("/post") //http://localhost:8080/api/post
	public void post(@RequestBody Map<String, String> requestData) {
		
//		requestData.entrySet().forEach(strObjectEntry -> { 
//			
//			System.out.println("key : " + strObjectEntry.getKey());
//			System.out.println("value : " + strObjectEntry.getValue());
//		});
		
		requestData.forEach((key, value) -> { 
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		});
	}
	
	@PostMapping("/post-object") // //http://localhost:8080/api/post-object
	public void postObject(@RequestBody PostDto dto) {
		System.out.println(dto);
	}
}
