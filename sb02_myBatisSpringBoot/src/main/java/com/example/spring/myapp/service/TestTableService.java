package com.example.spring.myapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.sping.domain.TableVO;

@Component
public interface TestTableService {
	
	// C
	public void insert(TableVO tableVO) throws Exception;
	
	// R
	public List<TableVO> selectAllList() throws Exception;
	/* TableVO selectOne(long userCode) throws Exception; */
	public TableVO selectByUserCode(int userCode) throws Exception;
	
	// U
	public int update(TableVO tableVO) throws Exception;
		
	// D
	public int deleteByUserCode(int userCode) throws Exception;

	public void delete(int userCode)  throws Exception;
	
}
