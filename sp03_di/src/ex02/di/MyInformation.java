package ex02.di;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class MyInformation {
	
//	@Autowired
//	@Qualifier("info")
	private Person person; // has-a, ������, �л� ��� �� �� ����.
	
	// setter method DI
	public void  processMessage() {
		System.out.println(person);
	}
	
	public boolean processMessage(StudentPersonImpl student) {
		return this.person.personShow(student.getName(), student.getAge(), student.getGender());
	}
	
	public boolean processMessage(EmployeePersonImpl emp) {
//		return this.person.personShow(emp.getName(), emp.getAge(), emp.getGender());
		return this.person.personShow(emp);
	}
	
	public boolean processMessage(String name, int age, String gender) {
		return this.person.personShow(name, age, gender);
	}

	public MyInformation() {
		System.out.println("info �⺻������");
	}

//	public MyInformation(Person person) {
//		super();
//		System.out.println("info all������");
//	}
}
