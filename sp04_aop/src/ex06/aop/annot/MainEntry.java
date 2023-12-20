package ex06.aop.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex06/aop/annot/appCtx.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config); 
		
		Student student = ctx.getBean("student", Student.class);
		
		Worker worker = (Worker)ctx.getBean("worker");
		
		student.getStudentInfo();
		worker.getWorkerInfo();
		System.out.println("**************************");
		
		
		
		
		
		
		
		
		
	}
}
