package quiz;

public interface IMessage {
	
	public void sayHello();
	public String sayMessage();

}

// 해당 인터페이스를 implements하는 클래스 만들기 - 영어인사말(IMessageImplEng.java), 한글인사말(IMessageImplKor.java)
// 빈으로 객체 생성하기 - IMessageImplKor인사는 생성자함수 이용, IMessageImplEng 인사는 setter method 이용할것