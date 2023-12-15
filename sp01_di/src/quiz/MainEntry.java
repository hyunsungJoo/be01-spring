package quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex05.DI.MemberDAO;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "quiz/msgCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		
		IMessageImplKor kor = (IMessageImplKor)ctx.getBean("kor"); // Object타입이기때문에 형변환 해주어야함
		IMessageImplEng eng = (IMessageImplEng)ctx.getBean("eng");
		
		kor.sayHello();
		eng.sayHello();
	}
}
