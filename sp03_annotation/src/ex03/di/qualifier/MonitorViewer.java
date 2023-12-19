package ex03.di.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class MonitorViewer {
	
	private Recorder recorder; // has-a관계
	
//	@Autowired(required = false) // defalut : required = true
////	@Inject // autowired와 같음, 자바에서 제공
//	public MonitorViewer(@Qualifier("key") Recorder recorder) { // constructor method DI
//		this.recorder = recorder;
//		System.out.println("@Autowired 자동 주입");
//	}
	
//	@Autowired
//	@Qualifier("record4") // id = "record4"	
//	@Qualifier("rr1") // name = "rr1"
//	@Qualifier("code") // value = "code"
//	public void setRecorder(Recorder recorder) { // setter method DI
//		this.recorder = recorder;
//		System.out.println("setRecorder method call~~");
//	}
	
	
	public void show() {
		recorder.show();
		System.out.println("MonitorViewer class show method call~~~~");
		System.out.println("setter method MpnitorViewer class show method call~~~~");
	}
	
}
