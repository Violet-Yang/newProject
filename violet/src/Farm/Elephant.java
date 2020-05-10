package Farm;

public class Elephant extends Animal{
	public Elephant(String name) {
		super(name);
	}

	@Override
	public void eat(int portion) {
		super.eat(portion); // <- �θ� Ŭ������ �Լ� ���� ���
		System.out.println(name+"��"+portion+"��ŭ�� ���� �Ծ���. �ƿ�����");
	}
	
	@Override
	public void talk() {
		System.out.println(name+"�̴� ��������!�ϰ� �����.");
	}

}
