package violet;

public class SuperSubCon {
	
	public static void main(String[] args) {
		CheeseCake cake=new CheeseCake();
		cake.yummy();
		cake.tasty();
	}
}

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasky Cake");
	}
}
/*	
	public static void main(String[] args) {
		Cake c1= new CheeseCake();
		CheeseCake c2=new CheeseCake();
		StrawberryCheeseCake c3=new StrawberryCheeseCake();
		
		c1.yummy();
		c2.yummy();
		c3.yummy();
	}
}

class Cake{
	public void yummy() {
		System.out.println("Cake+");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("CheeseCake");
	}
}

class StrawberryCheeseCake extends CheeseCake{
	public void yummy() {
		System.out.println("StrawberryCheeseCake");
	}
	
}
*/