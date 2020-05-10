package my_project;

import java.util.Scanner;

abstract class CacelField{
	public abstract void cancel();//추상매서드
}

class AllCancel extends CacelField {
	Reservation reservation=new Reservation();
//	int seatStatus[][];
//	int seatNum[][];
	@Override
	public void cancel() {
	//	CheckSeats.seatStatus=seatStatus;
	//	CheckSeats.seatNum=seatNum;
		Scanner scan=new Scanner(System.in);
		System.out.println("예매된 좌석을 모두 취소하시겠습니까?(yes/no)");
		String scanNum=scan.next();
		if(scanNum.contentEquals("yes")) {
			for(int i=0;i<5;i++){

				for(int j=0;j<6;j++){
					CheckSeats.seatStatus[i][j]=0;
					if(CheckSeats.seatStatus[i][j]==0) {
						System.out.print(CheckSeats.seatNum[i][j]+" ");
					}else {//no를 입력했을 때
						
					    System.out.print("");
					}
				}
				System.out.println();
			}
			System.out.println("모든 예매내역이 취소되었습니다.");
		}
		
	}
	
}

