package ex02.di;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
//@AllArgsConstructor
@Data
public class StudentPersonImpl implements Person {
	
	private String name, gender;
	private int age;
	private ArrayList<Integer> score;

	@Override
	public boolean personShow(String name, int age, String gender) {
		System.out.println(name + " / " + age + " / " + gender);
		return true;
	}

	@Override
	public boolean personShow(Person person) {
		System.out.println(name + " / " + age + " / " + gender);
		return true;
	}
	
	public boolean personShow(ArrayList<Integer> score) {
		for (int i = 0; i < score.size(); i++) {
			System.out.println(score);
		}
		return true;
	}
}
