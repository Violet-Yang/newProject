package my_project;
//영화예매프로그램 참고==> https://blog.naver.com/ajdkfl6445/221467650823)
/* 1. 좌석 확인
 * 2. 좌석 예매(전체좌석 : 30 / 예약가능 좌석 : 30)
 * 3. 예매 취소하기
 * 4. 예매 일괄 취소하기
 * 5. 프로그램 종료
 */

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

class PrintLetter{
	public static void print() {
		System.out.println();
		System.out.println("--------영화관 예매 프로그램--------");
		System.out.println();
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예매(전체좌석:30 / 예약가능 좌석 :30");
		System.out.println("3. 예매 취소하기");
		System.out.println("4. 결제하기");
		System.out.println("5. 프로그램 종료");
		//System.out.println("4. 영화관의 별미!! 팝콘 먹으러~");
	}
}

class CheckSeats{
	static int num;
	public static String[][] seatNum={
			   {"a1","a2","a3","a4","a5","a6"},
		       {"b1","b2","b3","b4","b5","b6"},
		       {"c1","c2","c3","c4","c5","c6"},
		       {"d1","d2","d3","d4","d5","d6"},
		       {"e1","e2","e3","e4","e5","e6"}};
	public static int[][] seatStatus={
			   {0,0,0,0,0,0},
			   {0,0,0,0,0,0},
		       {0,0,0,0,0,0},
		       {0,0,0,0,0,0},
		       {0,0,0,0,0,0}};
	public static void check() {
		Scanner scan=new Scanner(System.in);
		System.out.println("  SCREEN");
		System.out.println();
		
		for(int i=0;i<5;i++){

			for(int j=0;j<6;j++){
				if(seatStatus[i][j]==1) {
					System.out.print("x "+" ");
				}else {
				    System.out.print(seatNum[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		
		//예매를 위한 코드--> 좌석이 비어있으면 false(0), 예매하면 true(1)
		//seatStatus[i][j]==1-1;
		
	}
}



public class Project1_PersonalProject {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	AllCancel cancel= new AllCancel();
	Reservation reserve=new Reservation();
	Select select=new Select();
	select.moive();
	while(true){
		PrintLetter.print();
		System.out.println();
		System.out.println("원하시는 서비스 번호를 입력하세요");
		int key=scan.nextInt();
			switch (key) {
			case 1: CheckSeats.check();
					break;
				case 2:reserve.reserve();
					break;
				case 3: cancel.cancel();
					
					break;
				case 4:
					break;
				default:
					break;
			}
		}
	}
}