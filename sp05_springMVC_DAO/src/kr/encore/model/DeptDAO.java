package kr.encore.model;

import java.util.List;

public interface DeptDAO {
	
	public List listDept(); // selectAll
	public void insertDept(DeptDTO dto);

}
