package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class MonitorViewer {
	
	// 1. 필드에 적용
//	@Autowired
	@Qualifier("record")
	private Recorder recorder; // has-a 
	
	
	// 2. setter method를 통한 자동주입
//	@Autowired
//	public void setRecorder(Recorder recorder) {
//		this.recorder = recorder;
//	}
	
	// 3. 일반적인 메소드
	@Autowired
	@Qualifier("record")
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("사용자(일반)메소드 이용한 자동 주입");
	}
	
	// 4. 생성자 함수를 이용한 주입 // 생성자를통해 주입하면 기본생성자가 생성안됨...?
	@Autowired
	public MonitorViewer(@Qualifier("record2")Recorder recorder) {
		this.recorder = recorder;
		System.out.println("나 생성자 함수 이용한 자동 주입");
	}

	public void print() {
		recorder.show();
	}

	public MonitorViewer() {
		System.out.println("monitorViewer 기본생성자");
	}
	
	
}
