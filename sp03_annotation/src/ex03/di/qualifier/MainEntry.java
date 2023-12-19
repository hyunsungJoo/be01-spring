package ex03.di.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex03/di/qualifier/qualifierCtx.xml"); // 생성자 실행
		
		MonitorViewer viewer = (MonitorViewer)ctx.getBean("monitorViewer");
		
		viewer.show();

	}
}
