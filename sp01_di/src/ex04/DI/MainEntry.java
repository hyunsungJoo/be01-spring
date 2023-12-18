package ex04.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/DI/appCtx.xml"); // 설정파일 기재 - xml기반
		ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml");
		//자기한테 맞는애 알아서 찾아가줌
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext(new String[] {"appCtx.xml", "daos.xml", "appCtx.xml"});
		
		
		IRecordViewImpl view = (IRecordViewImpl)context.getBean("view");
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("v"); // name(별칭으로도 됨)
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("abc"); // name(별칭으로도 됨)
//		IRecordViewImpl view = context.getBean("view", IRecordViewImpl.class); // 방법2
		view.print();
		
//		IRecordImpl record = new IRecordImpl();
//		
//		IRecordViewImpl view = new IRecordViewImpl();
//		
//		//조립
//		view.setRecord(record);
//		view.input();
//		view.print();
	}
}
