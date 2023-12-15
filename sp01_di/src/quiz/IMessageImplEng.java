package quiz;

import lombok.Data;

@Data
public class IMessageImplEng implements IMessage {
	
	private String name, greeting;
	
	@Override
	public void sayHello() {
		System.out.println(name + " " + greeting);
	}

	@Override
	public String sayMessage() {
		return greeting;
	}
}
