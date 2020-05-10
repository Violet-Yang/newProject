package my_project;

import java.util.Scanner;

public class Reservation {
//	public String[][] seatNum;
//	public int[][] seatStatus;
	public void reserve() { 
		Scanner scan=new Scanner(System.in);
		System.out.println("행을 입력하세요(a,b,c,d,e)");
		String line= scan.next();
		System.out.println("열을 입력하세요(1,2,3,4,5,6)");
		String row= scan.next();
		boolean check = false;
		//else if(!check){
		//System.out.println("잘못 입력하셨습니다.");
		//break;

		//입력한 a와 b의 합이 seatNuM의 값과 일치하는지 for문 안에서 값 비교 

		for(int i=0;i<5;i++) {
			
			for(int j=0;j<6;j++) {
				
				if(CheckSeats.seatNum[i][j].equals(line+row)) { //seatNuM.equals(a3)
					
					//System.out.print(seatNuM[i][j]+" ");
					System.out.println(CheckSeats.seatNum[i][j]+" 좌석의 예매가 완료 되었습니다!");
					//seatNuM[i][j]=indexOf.add("X");
					//System.out.println(seatNuM[i][j].indexOf("x"));
					CheckSeats.seatStatus[i][j]=1;
					
				}
			}
		}
		
	}

}
