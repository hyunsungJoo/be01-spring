package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	
	// 1. �ʵ忡 ����
//	@Autowired
	private Recorder recorder; // has-a 
	
	
	// 2. setter method�� ���� �ڵ�����
//	@Autowired
//	public void setRecorder(Recorder recorder) {
//		this.recorder = recorder;
//	}
	
	// 3. �Ϲ����� �޼ҵ�
//	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("�����(�Ϲ�)�޼ҵ� �̿��� �ڵ� ����");
	}
	
	// 4. ������ �Լ��� �̿��� ����
	@Autowired
	public MonitorViewer(Recorder recorder) {
		super();
		this.recorder = recorder;
		System.out.println("�� ������ �Լ� �̿��� �ڵ� ����");
	}


	public void print() {
		recorder.show();
	}
}
