package Farm;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	// write your code here
	Animal animal; //��ü����
	String name=getAnimalName();
	int animalChoice =getUserChoice(name);
	//int choice = getUserChoice();
	if(animalChoice ==1) {
		animal = new Cat(name);
	}else if(animalChoice ==2){
		animal = new Dog(name);//������ �翬��
	}else {
		animal=new Elephant(name);
	}
	getUserChoice(animal);
}


	private static int getUserChoice(String name) {
		Scanner scan=new Scanner(System.in);
		System.out.println(name+"�� � �����ΰ�");
		System.out.println("1. �����");
		System.out.println("2. ������");
		System.out.println("3. �ڳ���");
		return scan.nextInt();
	}

//�͹̳� �Ǵ� cmd�κ��� ��Ʈ���� �Է¹޴� �޼���
	private static String getAnimalName() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�� ���� ģ���� �̸�:");
		return scan.next();
	}
	
	// abstract(Animal Class) -> ȥ�ڼ� ���� Ŭ���� �����ؼ� ���Ұ�, �ٸ� Ŭ������ ���(Cat Class)��Ų �Ŀ�  �� Ŭ������ �̿��Ͽ� ��� ����
	
	private static void getUserChoice(Animal animal) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �ٱ��? 1.�ش� / 2.���ش�");
		int num=scan.nextInt();
		if (num==1) {
			animal.eat(getPortion());
			animal.talk();
			if(animal.getSatisfation() >= 100) {
				System.out.println("��ҷ���~~");
				// �� ����
			} else getUserChoice(animal); // �ƴϸ� �ٽ� ���ֱ�
		}else noFood(animal);
		}
	

	private static int getPortion() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �󸶳� �ٱ��?");
		return scan.nextInt();
		
	}
	
	private static void noFood(Animal animal) {
		Scanner scan=new Scanner(System.in);
		System.out.println("����");
		getUserChoice(animal);
	}
}
