package Farm;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	// write your code here
	Animal animal; //객체생성
	String name=getAnimalName();
	int animalChoice =getUserChoice(name);
	//int choice = getUserChoice();
	if(animalChoice ==1) {
		animal = new Cat(name);
	}else if(animalChoice ==2){
		animal = new Dog(name);//포만감 당연히
	}else {
		animal=new Elephant(name);
	}
	getUserChoice(animal);
}


	private static int getUserChoice(String name) {
		Scanner scan=new Scanner(System.in);
		System.out.println(name+"은 어떤 동물인가");
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		System.out.println("3. 코끼리");
		return scan.nextInt();
	}

//터미널 또는 cmd로부터 스트링을 입력받는 메서드
	private static String getAnimalName() {
		Scanner scan=new Scanner(System.in);
		System.out.println("새 동물 친구의 이름:");
		return scan.next();
	}
	
	// abstract(Animal Class) -> 혼자서 절대 클래스 선언해서 사용불가, 다른 클래스에 상속(Cat Class)시킨 후에  그 클래스를 이용하여 사용 가능
	
	private static void getUserChoice(Animal animal) {
		Scanner scan=new Scanner(System.in);
		System.out.println("밥을 줄까요? 1.준다 / 2.안준다");
		int num=scan.nextInt();
		if (num==1) {
			animal.eat(getPortion());
			animal.talk();
			if(animal.getSatisfation() >= 100) {
				System.out.println("배불러용~~");
				// 앱 종료
			} else getUserChoice(animal); // 아니면 다시 밥주기
		}else noFood(animal);
		}
	

	private static int getPortion() {
		Scanner scan=new Scanner(System.in);
		System.out.println("밥을 얼마나 줄까요?");
		return scan.nextInt();
		
	}
	
	private static void noFood(Animal animal) {
		Scanner scan=new Scanner(System.in);
		System.out.println("낑낑");
		getUserChoice(animal);
	}
}
