package ex05.DI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter / Setter / ToString
@AllArgsConstructor // 변수모두가지고있는생성자
public class MemberDTO { // model
	
	private String name;
	private int age;
	private String message;
	
	
}
