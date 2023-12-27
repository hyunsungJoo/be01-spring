package com.encore.sb03myBatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableVO { // 계층 간 데이터 교환을 위해 사용하는 객체
	
	private int userCode;
	private String username;

}
