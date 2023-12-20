package edu.encore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class UserVO { // model - 클래스이름 ~~DTO, ~~VO, ~~TO로 함 보통
	
	private String id, name, password;


	
	
}
