package Farm;

import java.util.Random;
import java.util.Scanner;

public abstract class Animal {
	public String name;
	int satisfation = 0;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public int getSatisfation() {
		System.out.println(this.name + "의 현재 포만감은 : " + this.satisfation);
		return this.satisfation;
	}
		
	public void eat(int portion) {
		this.satisfation += portion;
	}
	
	public void talk() {
		System.out.println("블라블라");
	}
}