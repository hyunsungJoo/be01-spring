package ex06.aop.annot;

import lombok.Setter;

@Setter
public class Worker { // ������ Ŭ����

	private String name;
	private int age;
	private String job;
	
	public void getWorkerInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("���� : " + this.job);
	}	
}
