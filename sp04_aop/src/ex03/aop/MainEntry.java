package ex03.aop;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "classpath:ex03/aop/appCtx.xml";
		
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext(config);
		
		// Proxy ����� ��ü�� �ѱ��. �ʿ��� ��ü ���� �۾��� XML ��������
		ICalc proxy = ctx.getBean("proxy", ICalc.class);
		System.out.println(proxy.add(20, 30));
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.mul(5, 3));
	}
}
