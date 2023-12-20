package ex02.aop.java;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		
		ICalc c = new ICalcImpl();

		ICalc proxy = (ICalc)Proxy.newProxyInstance(
						c.getClass().getClassLoader(), 	// loader : Ŭ���� ã��
						c.getClass().getInterfaces(), 	// interface : ����(�Լ�)
						new LogPrintHandlerImpl(c));    // h : �������� ����
		
		// Proxy�� ���ؼ� ����
		System.out.println(proxy.add(2, 5));
		System.out.println(proxy.mul(5, 3));
		System.out.println(proxy.sub(10, 20, 30));
		
		// Ŭ���� ���ؼ� ����
//		System.out.println(c.add(1, 2));
//		System.out.println(c.add(10, 22));
//		System.out.println();
//		System.out.println(c.mul(3, 5));
//		System.out.println(c.sub(5, 7, 2));
	}
}
