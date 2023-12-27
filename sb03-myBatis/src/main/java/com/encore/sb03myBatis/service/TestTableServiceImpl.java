package com.encore.sb03myBatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// DB에 접근하여 데이터를 조회하거나 조작하는 기능 전담하는 객체
// DataBase에 접근하기 위한 로직 & 비지니스 로직을 분리하기 위해 사용한다.

import com.encore.sb03myBatis.domain.TableVO;
import com.encore.sb03myBatis.model.mapper.TestTableMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestTableServiceImpl implements TestTableService {
	
	@Autowired
	TestTableMapper testTableMapper;

	@Override
	public void insert(TableVO tableVO) throws Exception {
		testTableMapper.insert(tableVO);

	}

	@Override
	public List<TableVO> selectAllList() throws Exception {
		return testTableMapper.selectAllList();
	}
	
	@Override
	public TableVO selectByUserCode() throws Exception {
		return testTableMapper.selectByUserCode();
	}

	@Override
	public int update(TableVO tableVO) throws Exception {
		return testTableMapper.update(tableVO);
	}

	@Override
	public int deleteByUserCode(int userCode) throws Exception {
		return testTableMapper.deleteByUserCode(userCode);
	}

}
