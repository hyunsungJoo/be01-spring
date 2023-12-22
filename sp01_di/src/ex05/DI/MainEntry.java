package ex05.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex05/DI/memberCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config); // 설정파일
		
		MemberDAO dao = (MemberDAO)ctx.getBean("dao"); // Object타입이기때문에 형변환 해주어야함 // id
//		MemberDAO dao2 = ctx.getBean("dao", MemberDAO.class);
		MemberDAO dao2 = (MemberDAO)ctx.getBean("dao");
		
		dao.insert();
	}

}
