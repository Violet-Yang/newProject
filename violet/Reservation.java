package my_project;

import java.util.Scanner;

public class Reservation {
//	public String[][] seatNum;
//	public int[][] seatStatus;
	public void reserve() { 
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(a,b,c,d,e)");
		String line= scan.next();
		System.out.println("���� �Է��ϼ���(1,2,3,4,5,6)");
		String row= scan.next();
		boolean check = false;
		//else if(!check){
		//System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		//break;

		//�Է��� a�� b�� ���� seatNuM�� ���� ��ġ�ϴ��� for�� �ȿ��� �� �� 

		for(int i=0;i<5;i++) {
			
			for(int j=0;j<6;j++) {
				
				if(CheckSeats.seatNum[i][j].equals(line+row)) { //seatNuM.equals(a3)
					
					//System.out.print(seatNuM[i][j]+" ");
					System.out.println(CheckSeats.seatNum[i][j]+" �¼��� ���Ű� �Ϸ� �Ǿ����ϴ�!");
					//seatNuM[i][j]=indexOf.add("X");
					//System.out.println(seatNuM[i][j].indexOf("x"));
					CheckSeats.seatStatus[i][j]=1;
					
				}
			}
		}
		
	}

}
