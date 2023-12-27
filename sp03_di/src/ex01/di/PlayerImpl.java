package ex01.di;

// Player인터페이스를 상속 받은 PlayerImpl클래스
import java.util.Scanner;

public class PlayerImpl implements Player {
	
	private String name, position, sport;
	
	// 선수 이름과 포지션을 입력받는 함수
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("선수 이름 : ");
		this.name = sc.next();
		System.out.print("포지션 : ");
		this.position = sc.next();
//		System.out.print("종목 : ");
//		this.sport = sc.next();
	}

	// 선수 이름과 포지션을 출력하는 함수
	@Override
	public void info() {
		System.out.println("\n==========선수정보==========");
		System.out.println("선수 이름 : " + this.name);
		System.out.println("포지션 : " + this.position);
//		System.out.println("종목 : " + this.sport);
//		System.out.println();
	}

}
