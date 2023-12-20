package edu.encore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import edu.encore.model.UserVO;

public abstract class UserDAO { // �߻�Ŭ����

	// DB ���� ���� �޼ҵ�
	public abstract Connection getConnection() throws Exception; // �߻�޼���

	// ��� (DML��ɾ�)
	// insert
	public void insert(UserVO vo) throws Exception {
		Connection conn = getConnection();
		String sql = "insert into users(id, name, password) values(?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getId());
		pstmt.setString(3, vo.getId());

		int result = pstmt.executeUpdate();
		System.out.println(result + " �� �Է� ����!!!");

		conn.commit();

		pstmt.close();
		conn.close();
	} // end insert

	// selectAll
	public void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM USERS");

			System.out.println("\nID \t  Name \t   PWD");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				System.out.println(id + "\t" + name + "\t" + pwd);
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // try end
	} // end selectAll()

	// selectById
	public void selectById(String id) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE id = " + id);
		
		System.out.println("\nID \t  Name \t   PWD");
		while (rs.next()) {
			String myid = rs.getString("id");
			String name = rs.getString("name");
			String pwd = rs.getString("password");
			System.out.println(myid + "\t" + name + "\t" + pwd);
		} // while end

		

	}

	// update
	public void update() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection conn = getConnection();
		String sql = "UPDATE users set name = ?, password = ? where id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("������ id�� �Է��ϼ��� : ");
		pstmt.setString(3, sc.next());
		System.out.println("name�� pwd�� ���氪�� �Է��ϼ��� :");
		pstmt.setString(1, sc.next());
		pstmt.setString(2, sc.next());

		int result = pstmt.executeUpdate(); 

		System.out.println(result + " �� ������ UPDATE ������.");

		conn.commit(); 
		
		pstmt.close();

	}

	// delete
	public void delete() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection conn = getConnection();
		System.out.println("users���̺��� ������ id�� �Է��ϼ��� : ");
		String sql = "DELETE FROM users WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());

		int result = pstmt.executeUpdate(); // ��ȯ���� ���� ��� - insert, update, delete

		System.out.println(result + " �� ������ ���� ������.");

		conn.commit(); // Ŀ�ԿϷ�
		// 4. �ݱ� (�ڿ���ȯ)
		pstmt.close();
	}

	// menu
	public void menu() {
		System.out.println("�����ϼ���: \n1.Insert ");
		System.out.println("2.SelectAll \n3.SelectById \n4.Update \n5.Delete ");
	}

}
