package com.encore.sb01web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // DELETE, http://localhost:8080/api
public class DeleteApiController {
	
	@DeleteMapping("/delete/{userId}") // http://localhost:8080/api/delete/joo, http://localhost:8080/api/delete/300
	public void delete(@PathVariable String userId) { // PathVariable 넘어온 값 받아줌, 넘어온 값이랑 변수명 같아야함
			//  delete(@PathVariable(name = "userId') String id) { // 변수명이 다를경우
			//  delete(@RequestBody String account) { http://localhost:8080/api/delete/300?account=joo
		
		System.out.println(userId);
//		System.out.println(account);
	}
	
	// delete --> 리소스 삭제 200 OK, 자원이 있어서 삭제하던, 없어서 삭제하던 200 OK가 나옴
	
}
