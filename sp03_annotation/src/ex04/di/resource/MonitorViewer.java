package ex04.di.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MonitorViewer {
	
	private Recorder recorder; // has-a관계
	
	// java기반이기때문에 별로 안씀
//	@Resource
//	@Resource(name = "r3") // Resource는 name으로 찾는다, 생성자에는 못들어감
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
		System.out.println("Resource 주입");
	}
}
