package ex04.di.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MonitorViewer {
	
	private Recorder recorder; // has-a����
	
	// java����̱⶧���� ���� �Ⱦ�
//	@Resource
//	@Resource(name = "r3") // Resource�� name���� ã�´�, �����ڿ��� ����
//	@Resource @Qualifier("y")
//	public void setRecorder(@Qualifier("y") Recorder recorder) {
	
	@Resource(name = "x")
	public void setRecorder(Recorder recorder) { // DI
		this.recorder = recorder;
		
		boolean record = Resource.class.getTypeName().contains("record1");
		System.out.println(record);
		
		System.out.println(!Resource.class.getTypeName().contains("reocord1"));
		System.out.println(Resource.class.getTypeName().equals("record1"));
		
		System.out.println(Resource.AuthenticationType.class);
		System.out.println("---------------------------");
		
		recorder.show();
		System.out.println();
		System.out.println("Resource ����");
	}
}
