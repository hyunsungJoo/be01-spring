package com.encore.sb01web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.encore.sb01web.dto.UserDto;

@RestController // Json 형태로 객체 데이터를 반환
@RequestMapping("/api/get") // GET,  
public class GetApiController {
	
	@GetMapping("/hello") // GET, http://localhost:8080/api/get/hello
//	@RequestMapping(path = "/api/get/hello", method = RequestMethod.GET)
//	@GetMapping(path = "/hello")
	public String getHello() {
		return "<h1>Hello SpringBoot</h1>";
	}
	@RequestMapping(path = "/hi", method = RequestMethod.GET) // GET, http://localhost:8080/api/get/hi, method생략되면 default = GET
	public String hi() {
		return "<h1><font color = 'red'>hi~~~</font></h1>";
	}
	
//	http://localhost:8080/api/get/path-variable/joo
	
//	@GetMapping("pathVariable/{id}") // 11버전까지는 주소줄에 대문자 쓰면 오류 났었음, 지금은 가능
	@GetMapping("/path-variable/{id}") // 매번 주소가 변화 되는 내용을 받겠다면 {} 변경될 내용 기재
//	public String pathVariable(@PathVariable String id) {
	public String pathVariable(@PathVariable(name = "id") String pathId) {
		System.out.println("PathVariavle : " + pathId);
		return pathId;
	}
	
	//구글에서 검색어 aa로 검색 결과
	/*
	rCAgoQABgDGI8BGOoCwgIKEhttps://www.google.com/
	search?q=aa&sca_esv=593016252
	&source=hp
	&ei=Fy-FZYlOiveHA7PWtUA&iflsig=AO6bgOgAAAAAZYU9Jw7qbUiffFItKAdAMX2IXm8nHBer&ved=0ahUKEwjJtaPOt6KDAxWK-2EKHTNrDQgQ4dUDCAw&uact=5&oq=aa&gs_lp=Egdnd3Mtd2l6GgIYAyICYWEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATIREC4YgAQYsQMYgwEYxwEY0QMyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIsDMgUQABiABDIFEAAYgAQyCBAAGIAEGLEDSPQXUN8BWJ8DcAF4AJABAJgBcaAB3wGqAQMwLjK4AQPIAQD4AQGoAgC4YAxiPARjqAsICDhAuGIAEGLEDGMcBGNEDwgILEC4YgAQYxwEY0QPCAg4QABiABBixAxiDARiLA8ICFxAuGIAEGLEDGMcBGNEDGIsDGNIDGKgDwgIHEAAYAxiLAw&sclient=gws-wiz
	*/
	
	// ?key=value&key2=value2&key3=value3,.... // 값이 너무 많을 땐 어떻게 해야하느냐???
	@GetMapping(path = "query-param01") // http://localhost:8080/api/get/query-param01?name=joo&email=aa@naver.com&age=22
	public String queruParam01(@RequestParam String name,@RequestParam String email,@RequestParam String age) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		return name + ", " + email + ", " + age;
	}
	
	// ?key=value&key2=value2&key3=value3,.... // 값이 많으면 이런식으로 해준다.
	@GetMapping(path = "query-param02") // http://localhost:8080/api/get/query-param02?user=kang&email=bb@naver.com&age=33
	public String queryParam02(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry : queryParam.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			sb.append(entry.getKey() + "=" + entry.getValue());
		}
		return sb.toString();
	}
	
	// ?key=value&key2=value2&key3=value3,.... // http://localhost:8080/api/get/query-param03?name=joo&email=aa@naver.com&age=22
	@GetMapping(path = "query-param03") // 객체타입으로 리턴 할때는 RequestParam사용하지 않기 때문에 여러데이터 보낼때는 객체타입 권장
	public String queryParam03(UserDto dto) {
		
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getEmail());
		
		return dto.toString();
	}
}
