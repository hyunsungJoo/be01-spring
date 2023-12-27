package com.encore.sb03myBatis.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.encore.sb03myBatis.domain.TableVO;

@Component
public interface TestTableService {
	
	// C
	public void insert(TableVO tableVO) throws Exception;
	
	// R
	public List<TableVO> selectAllList() throws Exception;
	public TableVO selectByUserCode() throws Exception;
	
	// U
	public int update(TableVO tableVO) throws Exception;
	
	// D
	public int deleteByUserCode(int userCode) throws Exception;
}
