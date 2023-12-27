package com.encore.sb03myBatis.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.encore.sb03myBatis.domain.TableVO;

@Mapper // DML 명령처리하는 것이라 알려주는 어노테이션
public interface TestTableMapper {
	
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
