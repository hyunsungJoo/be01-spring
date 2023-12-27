package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Basketball {
	
	@Autowired
	@Qualifier("player2") // autowired 지정
	private PlayerImpl player; // has-a관계 // 농구는 선수들의 정보를 포함하고 있다.
	
	
	// 이거 대신 쓸수있는 lombok은?
	public void setPlayer(PlayerImpl player) { // DI
		this.player = player;
	}
}
