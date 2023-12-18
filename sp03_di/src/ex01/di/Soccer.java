package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Soccer {
	
	@Autowired // �ڵ����Եȴ�.
	private PlayerImpl player;

	// autowired����ϸ� �ڵ����ԵǱ⶧���� ��� ��.
//	public void setPlayer(PlayerImpl player) { // DI
//		this.player = player;
//	}
}

/*
	@Autowired : Type���
	���� : �������踦 �ڵ������Ҷ� ����ϸ� [Ÿ���� �̿�]�Ͽ� �����ϴ� ��ü�� ������ �ش�.
	�׷��Ƿ� (Ioc Container) �ش� Ÿ���� �� ��ü�� �������� �ʰų� �Ǵ� 2�� �̻� ������ ��� 
	�������� ���ܸ� �߻���Ű�� �ȴ�.
	
	���� ��ġ : �ļ���, �ʵ�, �޼ҵ�(���� setter�޼��� �ƴϾ �ȴ�)
	
	@Required
	Autowired ������̼��� ������ ������Ƽ�� ���� ���� ������ �ʿ䰡 ���� ��쿡
	false ���� �ָ� �̶� �ش� ������Ƽ�� �������� �ʴ��� �������� ���ܸ� �߻���Ű�� �ʴ´�. ����Ʈ�� true
*/