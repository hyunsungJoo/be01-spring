package ex05.DI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter / Setter / ToString
@AllArgsConstructor // ������ΰ������ִ»�����
public class MemberDTO { // model
	
	private String name;
	private int age;
	private String message;
	
	
}
