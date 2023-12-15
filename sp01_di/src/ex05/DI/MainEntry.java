package ex05.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex05/DI/memberCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config); // ��������
		
		MemberDAO dao = (MemberDAO)ctx.getBean("dao"); // ObjectŸ���̱⶧���� ����ȯ ���־����
//		MemberDAO dao2 = ctx.getBean("dao", MemberDAO.class);
		MemberDAO dao2 = (MemberDAO)ctx.getBean("dao");
		
		dao.insert();
	}

}
