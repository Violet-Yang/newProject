package my_project;
//��ȭ�������α׷� ����==> https://blog.naver.com/ajdkfl6445/221467650823)
/* 1. �¼� Ȯ��
 * 2. �¼� ����(��ü�¼� : 30 / ���డ�� �¼� : 30)
 * 3. ���� ����ϱ�
 * 4. ���� �ϰ� ����ϱ�
 * 5. ���α׷� ����
 */

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

class PrintLetter{
	public static void print() {
		System.out.println();
		System.out.println("--------��ȭ�� ���� ���α׷�--------");
		System.out.println();
		System.out.println("1. �¼� Ȯ��");
		System.out.println("2. �¼� ����(��ü�¼�:30 / ���డ�� �¼� :30");
		System.out.println("3. ���� ����ϱ�");
		System.out.println("4. �����ϱ�");
		System.out.println("5. ���α׷� ����");
		//System.out.println("4. ��ȭ���� ����!! ���� ������~");
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
		
		
		//���Ÿ� ���� �ڵ�--> �¼��� ��������� false(0), �����ϸ� true(1)
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
		System.out.println("���Ͻô� ���� ��ȣ�� �Է��ϼ���");
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