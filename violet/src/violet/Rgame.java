package violet;

import java.util.Random;

/*
 * RPG������ �ַܼ� ������ �غ��ô�.
 * �÷��̾� ���� �÷�� ������ �� �� 1~10���� ���ظ� ���� �� ���� ���� ���� �������� �Դϴ�.
 * �� �� �ϳ��� hp100 �ǰ� 0�� �� �� RIP��� �޽����� ���
 * �÷��̾ �¸��� �¸� �޽��� ���
 * �÷��̾ ������ RIP�й� �� �޽����� ȣ��
 */

public class Rgame{
	Random rnd =new Random();
	public static void main(String[] args)	{
		Monster ms=new Monster();
		ms.attack();
		
	while(true) {
	
	}
		
	}
	
	public void attack() {
		int point =(int)(Math.random()*10);
	}
	
	
}
	
class Monster{
	int heart = 100;
	public Monster() {
		
	}
	public void attack() {
		System.out.println("���ݴ��߽��ϴ�.");
	}
}

class Player{
	
	public void die() {
		System.out.println("RIP");
	}
	
}

