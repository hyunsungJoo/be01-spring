package ex04.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/DI/appCtx.xml"); // �������� ���� - xml���
		ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml");
		//�ڱ����� �´¾� �˾Ƽ� ã�ư���
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext(new String[] {"appCtx.xml", "daos.xml", "appCtx.xml"});
		
		
		IRecordViewImpl view = (IRecordViewImpl)context.getBean("view");
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("v"); // name(��Ī���ε� ��)
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("abc"); // name(��Ī���ε� ��)
//		IRecordViewImpl view = context.getBean("view", IRecordViewImpl.class); // ���2
		view.print();
		
//		IRecordImpl record = new IRecordImpl();
//		
//		IRecordViewImpl view = new IRecordViewImpl();
//		
//		//����
//		view.setRecord(record);
//		view.input();
//		view.print();
	}
}
