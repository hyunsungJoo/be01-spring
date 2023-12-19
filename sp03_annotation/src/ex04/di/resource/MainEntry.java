package ex04.di.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex04/di/resource/resourceCtx.xml"); // 생성자 실행
		
		MonitorViewer viewer = (MonitorViewer)ctx.getBean("monitorViewer");
		
//		viewer.show();

	}
}
