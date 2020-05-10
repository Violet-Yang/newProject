package violet;

import java.util.Random;

/*
 * RPG게임을 콘솔로 구현을 해봅시다.
 * 플레이어 몬스터 플레어가 공격을 할 때 1~10까지 피해를 입힐 수 있음 몬스터 또한 마찬가지 입니다.
 * 둘 중 하나가 hp100 피가 0이 될 때 RIP라는 메시지를 출력
 * 플레이어가 승리시 승리 메시지 출력
 * 플레이어가 죽으면 RIP패배 이 메시지를 호출
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
		System.out.println("공격당했습니다.");
	}
}

class Player{
	
	public void die() {
		System.out.println("RIP");
	}
	
}

