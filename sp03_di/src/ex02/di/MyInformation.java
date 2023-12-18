package ex02.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class MyInformation {
	
//	@Autowired
//	@Qualifier("info")
	private Person person; // has-a, 직장인, 학생 모두 올 수 있음.
	
	// setter method DI
	
	public boolean processMessage(StudentPersonImpl student) {
		return this.person.personShow(student.getName(), student.getAge(), student.getGender());
	}
	
	public boolean processMessage(EmployeePersonImpl emp) {
//		return this.person.personShow(emp.getName(), emp.getAge(), emp.getGender());
		return this.person.personShow(emp);
	}
	
	@Autowired
	public boolean processMessage(String name, int age, String gender) {
		return this.person.personShow(name, age, gender);
	}

}
