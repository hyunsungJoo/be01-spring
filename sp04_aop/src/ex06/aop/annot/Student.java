package ex06.aop.annot;

import lombok.Setter;

@Setter // setter�� �������
public class Student { // �л� Ŭ����
	
	private String name;
	private int age, gradeNum, classNum;
	
	// setter method --> DI
	
	public void getStudentInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�г� : " + this.gradeNum);
		System.out.println("�� : " + this.classNum);
	}
}
