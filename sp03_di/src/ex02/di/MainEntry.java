package ex02.di;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex02/di/ctx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		
		StudentPersonImpl stu = (StudentPersonImpl)ctx.getBean("student");
		EmployeePersonImpl emp = (EmployeePersonImpl)ctx.getBean("employee");
		
		MyInformation info = (MyInformation)ctx.getBean("info");
//		MyInformation info2 = (MyInformation)ctx.getBean("info2");
		
		info.processMessage(stu);
		info.processMessage(emp); //?????????? 
//		info.setPerson(new StudentPerosnImpl());
		info.processMessage();
		
		info.processMessage("gildong", 30, "����");
		
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("aa");
		hobbys.add("bb");
		hobbys.add("cc");
		
		MyInformation info2 = ctx.getBean("info2", MyInformation.class);
		emp.personShow(hobbys);
		info2.processMessage(emp);
		info2.processMessage(stu);
	}
}
