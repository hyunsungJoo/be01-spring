package ex01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

import ex02.aop.java.ICalc;
import ex02.aop.java.ICalcImpl;

public class MainEntry {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		System.out.println(c.add(1, 2));
		System.out.println(c.add(10, 22));
		System.out.println();
		System.out.println(c.mul(3, 5));
		System.out.println(c.mul(5, 7, 2));
	}
}
