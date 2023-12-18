package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex01/di/playerCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		
		PlayerImpl p = (PlayerImpl)ctx.getBean("player");
		PlayerImpl p2 = (PlayerImpl)ctx.getBean("p1");
		
		//singleton (하나의 bean정의에 대해서 spring ioc container 내에 단 하나의 객체만 존재한다.)
		if(p == p2) { //싱글톤이면 same, 객체 생성할 때 scope="prototype"설정해주면 notsame
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Soccer s = (Soccer)ctx.getBean("soccer");
		
//		p.input();
//		p.info();
		
		String[] sportsName = {"축구", "컬링", "농구"};
		Object[] className = {ctx.getBean("soccer"), ctx.getBean("curling"), ctx.getBean("basketball")};
		
		for (int i = 0; i < sportsName.length; i++) {
			System.out.println(sportsName[i]);
			
			p.input();
			p.info();
			System.out.println("종목 : " + sportsName[i]);
		}			
		
	}
}
