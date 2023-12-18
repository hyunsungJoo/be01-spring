package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Basketball {
	
	@Autowired
	@Qualifier("player2") // autowired 없는상태에서 기재 불가
	private PlayerImpl player;

	public void setPlayer(PlayerImpl player) { // DI
		this.player = player;
	}

}
