
package com.example.spring.myapp.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sping.domain.TableVO;


@Mapper
public interface TestTableMapper {
	
	// C
	public void insert(TableVO tableVO) throws Exception;
	
	// R
	public List<TableVO> selectAllList() throws Exception;
	public TableVO selectByUserCode() throws Exception;
	
	// U
	public int update(TableVO tableVO) throws Exception;
	
	// D
	public int deleteByUserCode(int UserCode) throws Exception;
	
}
