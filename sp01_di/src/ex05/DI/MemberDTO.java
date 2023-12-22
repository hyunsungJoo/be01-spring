package ex05.DI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
public class MemberDTO { // model
	
	
	private String name;
	private int age;
	private String message;

	
}
