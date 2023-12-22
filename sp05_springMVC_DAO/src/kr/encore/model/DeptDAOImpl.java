package kr.encore.model;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component("dao")
@Component  // deptDAOImpl bean ���� 
public class DeptDAOImpl implements DeptDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;  // DML ��� ó�� Ŭ���� - insert, update, delete, select

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public List listDept() {  // select
		String sql = "SELECT * FROM DEPT ORDER BY DEPTNO DESC";
		
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertDept(DeptDTO dto) {  // insert
		String sql = "INSERT INTO dept(deptno, dname, loc) VALUES(?, ?, ?)";
		Object[] arr = { dto.getDeptno(), dto.getDname(), dto.getLoc() };
//		Connection conn = getJdbcTemplate().getDataSource().getConnection().setAutoCommit(false);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		this.jdbcTemplate.update(sql, arr);
	}
}

