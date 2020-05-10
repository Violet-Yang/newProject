package Farm;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}


	@Override
	public void eat(int portion) {
		super.eat(portion); // <- �θ� Ŭ������ �Լ� ���� ���
		System.out.println(name+"��"+portion+"��ŭ�� ���� �Ծ���. �߿�");
	}
	
	@Override
	public void talk() {
		System.out.println(name+"�̴� �߿�! �߿�! �ϰ� �����.");
	}

}
