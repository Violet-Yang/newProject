package violet;

//public class HomeWorkDay17_Quiz2 {
//
//}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HomeWorkDay17_Quiz2 {
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		// ObjectOutputStream 을 이용한 객체 파일 저장
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		System.out.println("비밀번호 입력");
		String pw=scan.next();
		System.out.println("이메일 입력");
		String email=scan.next();
		
		Member member1 = new Member("member1", "member_pw1", "member_email1");
		Member member2 = new Member("member2", "member_pw2", "member_email2");
		Member member3 = new Member("member3", "member_pw3", "member_email3");
		
		try{
			
			// member.data 파일의 객체 아웃풋스트림을 생성한다.
			fos = new FileOutputStream("member.data");
			oos = new ObjectOutputStream(fos);
			
			// 해당 파일에 3개의 객체를 순차적으로 쓴다
			oos.writeObject(member1);
			oos.writeObject(member2);
			oos.writeObject(member3);
			
			// member.data 파일에 3개의 객체 쓰기 완료.
			System.out.println("객체를 저장했습니다.");
		
		}catch(Exception e){
			
			e.printStackTrace();
		
		}finally{
			
			// 스트림을 닫아준다.
			if(fos != null) try{fos.close();}catch(IOException e){}
			if(oos != null) try{oos.close();}catch(IOException e){}	
		}
		
		// 파일로 부터 객체 데이터 읽어온다.
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			
			// member.data 파일로 부터 객체를 읽어오는 스트림을 생성한다.
			fis = new FileInputStream("member.data");
			ois = new ObjectInputStream(fis);
			
				int checkBoolean = 0;
				
				for(int i=0; i<3; i++)  { //조건식 다시 생각해보기****
					
					Member read_member = (Member)ois.readObject();
					
					if(read_member.returnPw().equals(pw) && read_member.returnEmail().equals(email)) {
						
						String memberId = read_member.returnId(); // id
						if(memberId.length() < 3) { // id가 3자 이하 일 경우
							System.out.println(memberId);
						} else { // id가 3자 이상 일 경우
							String id = memberId.substring(0,3); // id를 3글자만 추출하여 저장
							for(int length=0; i<memberId.length()-3; i++) { // 그 이후에 나오는 것들은 다 별표로 더해준다
								id += "*"; // id=id+"*";
							}
							System.out.println(id);
						}
						break;
					}
					
					checkBoolean++; // break문을 안타고 계속 더해질 경우 checkBoolean은 3이된다
				}
				
				if(checkBoolean == 3) { // break를 안 탈 경우 데이터가 없는 경우 이므로 이 조건문을 타게된다.
					System.out.println("조회 결과 데이터가 없습니다.");
				}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			// 스트림을 닫아준다.
			if(fis != null) try{fis.close();}catch(IOException e){}
			if(ois != null) try{ois.close();}catch(IOException e){}
		}
		
		
	}
}
