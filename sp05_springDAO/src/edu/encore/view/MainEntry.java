package edu.encore.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.encore.dao.UserDAO;
import edu.encore.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		UserDAO dao = ctx.getBean("dao", UserDAO.class);
		dao.menu();
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 1:
			UserVO vo = new UserVO();
			System.out.println("user id = ");
			vo.setId(sc.next());
			System.out.println("user name = ");
			vo.setName(sc.next());
			System.out.println("user pass = ");
			vo.setPassword(sc.next());
			
			dao.insert(vo);
			System.out.println(vo.getId() + " 추가 성공!!");
			System.out.println("----------------------");
			break;
		
		case 2: // selectAll
			dao.selectAll();
			break;
		case 3:
			System.out.println("찾을 id를 입력하세요 : ");
			String id = sc.next();
			dao.selectById(id);
			break;
		case 4:
			dao.update();
			break;
		case 5:
			dao.delete();
			break;
		default:
			System.out.println("없는 번호입니다. 다시 선택해주세요.");
			break;
		}
		
		
		
//		UserDAO dao = new MariaDBUserDAOImpl();
//		dao.getConnection();
		
	}

}
