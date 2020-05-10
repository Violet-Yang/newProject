package Farm;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}


	@Override
	public void eat(int portion) {
		super.eat(portion); // <- 부모 클래스의 함수 실행 방법
		System.out.println(name+"이"+portion+"만큼의 밥을 먹었다. 야옹");
	}
	
	@Override
	public void talk() {
		System.out.println(name+"이는 야옹! 야옹! 하고 울었다.");
	}

}
