package quiz;

public interface IMessage {
	
	public void sayHello();
	public String sayMessage();

}

// �ش� �������̽��� implements�ϴ� Ŭ���� ����� - �����λ縻(IMessageImplEng.java), �ѱ��λ縻(IMessageImplKor.java)
// ������ ��ü �����ϱ� - IMessageImplKor�λ�� �������Լ� �̿�, IMessageImplEng �λ�� setter method �̿��Ұ�