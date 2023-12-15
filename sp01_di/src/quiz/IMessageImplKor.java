package quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
public class IMessageImplKor implements IMessage {
	
	private String name, greeting;
	
	public IMessageImplKor() {}
	
	public IMessageImplKor(String name, String greeting) {
		this.name = name;
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		System.out.println(name + " " + greeting);
	}

	@Override
	public String sayMessage() {
		return greeting;
	}	
}
