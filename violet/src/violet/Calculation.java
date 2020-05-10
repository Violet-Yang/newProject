package violet;

class Cal{
	int addNum;
	int minusNum;
	int multiNum;
	double diviNum;
	
	public int add(int addNum, int minusNum) {
		return addNum+minusNum;
	}
	
	public int minus(int addNum, int minusNum) {
		return addNum-minusNum;
	}
	
	public int multiply(int addNum, int multiNum) {
		return addNum*multiNum;
	}
	
	public double divide(int addNum, double diviNum) {
		return addNum/diviNum;
	}

}
public class Calculation {

	public static void main(String[] args) {
		Cal cal=new Cal();
		int addResult=cal.add(3,5);
		int minusResult=cal.minus(9,4);
		int multiplyResult=cal.multiply(5,7);
		double dividResult=cal.divide(4,5);
		
		System.out.println(addResult);
		System.out.println(minusResult);
		System.out.println(multiplyResult);
		System.out.println(dividResult);
	}
}
