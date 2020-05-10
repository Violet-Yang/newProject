package Farm;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat(int portion) {
		super.eat(portion); // <- �θ� Ŭ������ �Լ� ���� ���
		System.out.println(name+"��"+portion+"��ŭ�� ���� �Ծ���. �۸�");
	}
	
	@Override
	public void talk() {
		System.out.println(name+"�̴� ��! ��! �ϰ� �����.");
	}

}
