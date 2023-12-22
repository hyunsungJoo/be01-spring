package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Curling {
	
	private PlayerImpl player;

	@Autowired
	@Qualifier("p2") // 구분해주기 위해 사용, 객체 여러개 있을 때 이름 지정
	public void setPlayer(PlayerImpl player) { // DI
		this.player = player;
	}

}
