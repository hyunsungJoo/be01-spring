package com.test.mybatis;

import java.util.ArrayList;

public interface MemberDAO {

	public ArrayList<Member> getMembers(); // select
	public void insertMember(Member member); // insert
	public void updateMember(String name); // update
	public void deleteMember(String name); // delete

}
