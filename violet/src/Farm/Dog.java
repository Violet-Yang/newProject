package Farm;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat(int portion) {
		super.eat(portion); // <- ºÎ¸ð Å¬·¡½ºÀÇ ÇÔ¼ö ½ÇÇà ¹æ¹ý
		System.out.println(name+"ÀÌ"+portion+"¸¸Å­ÀÇ ¹äÀ» ¸Ô¾ú´Ù. ¸Û¸Û");
	}
	
	@Override
	public void talk() {
		System.out.println(name+"ÀÌ´Â ¸Û! ¸Û! ÇÏ°í ¿ï¾ú´Ù.");
	}

}
