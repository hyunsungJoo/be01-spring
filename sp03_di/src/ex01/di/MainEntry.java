package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex01/di/playerCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		
		PlayerImpl p = (PlayerImpl)ctx.getBean("player");
		PlayerImpl p2 = (PlayerImpl)ctx.getBean("p1");
		
		//singleton (�ϳ��� bean���ǿ� ���ؼ� spring ioc container ���� �� �ϳ��� ��ü�� �����Ѵ�.)
		if(p == p2) { //�̱����̸� same, ��ü ������ �� scope="prototype"�������ָ� notsame
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Soccer s = (Soccer)ctx.getBean("soccer");
		
//		p.input();
//		p.info();
		
		String[] sportsName = {"�౸", "�ø�", "��"};
		Object[] className = {ctx.getBean("soccer"), ctx.getBean("curling"), ctx.getBean("basketball")};
		
		for (int i = 0; i < sportsName.length; i++) {
			System.out.println(sportsName[i]);
			
			p.input();
			p.info();
			System.out.println("���� : " + sportsName[i]);
		}			
		
	}
}
