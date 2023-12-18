package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Curling {
	
	private PlayerImpl player;

	@Autowired
	@Qualifier("p2") // �������ֱ� ���� ���, ��ü ������ ���� �� �̸� ����
	public void setPlayer(PlayerImpl player) { // DI
		this.player = player;
	}

}
