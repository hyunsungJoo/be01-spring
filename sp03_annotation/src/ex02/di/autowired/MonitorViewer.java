package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class MonitorViewer {
	
	// 1. �ʵ忡 ����
//	@Autowired
	@Qualifier("record")
	private Recorder recorder; // has-a 
	
	
	// 2. setter method�� ���� �ڵ�����
//	@Autowired
//	public void setRecorder(Recorder recorder) {
//		this.recorder = recorder;
//	}
	
	// 3. �Ϲ����� �޼ҵ�
	@Autowired
	@Qualifier("record")
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("�����(�Ϲ�)�޼ҵ� �̿��� �ڵ� ����");
	}
	
	// 4. ������ �Լ��� �̿��� ���� // �����ڸ����� �����ϸ� �⺻�����ڰ� �����ȵ�...?
	@Autowired
	public MonitorViewer(@Qualifier("record2")Recorder recorder) {
		this.recorder = recorder;
		System.out.println("�� ������ �Լ� �̿��� �ڵ� ����");
	}

	public void print() {
		recorder.show();
	}

	public MonitorViewer() {
		System.out.println("monitorViewer �⺻������");
	}
	
	
}
