package ex01.annot.java;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Cats {
	
	private MyCats myCats;
	
	public void getMyCatsInfo() {
		System.out.println("*************************");
		System.out.println("cats Name : " + myCats.getName());
		System.out.println("cats Age : " + myCats.getAge());
		System.out.println("cats Hobby : " + myCats.getHobbys());
		System.out.println("cats Weight : " + myCats.getWeight());
		System.out.println("cats Color : " + myCats.getColor());
		System.out.println("*************************");
		
	}
}
