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
		
		// ObjectOutputStream �� �̿��� ��ü ���� ����
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		System.out.println("��й�ȣ �Է�");
		String pw=scan.next();
		System.out.println("�̸��� �Է�");
		String email=scan.next();
		
		Member member1 = new Member("member1", "member_pw1", "member_email1");
		Member member2 = new Member("member2", "member_pw2", "member_email2");
		Member member3 = new Member("member3", "member_pw3", "member_email3");
		
		try{
			
			// member.data ������ ��ü �ƿ�ǲ��Ʈ���� �����Ѵ�.
			fos = new FileOutputStream("member.data");
			oos = new ObjectOutputStream(fos);
			
			// �ش� ���Ͽ� 3���� ��ü�� ���������� ����
			oos.writeObject(member1);
			oos.writeObject(member2);
			oos.writeObject(member3);
			
			// member.data ���Ͽ� 3���� ��ü ���� �Ϸ�.
			System.out.println("��ü�� �����߽��ϴ�.");
		
		}catch(Exception e){
			
			e.printStackTrace();
		
		}finally{
			
			// ��Ʈ���� �ݾ��ش�.
			if(fos != null) try{fos.close();}catch(IOException e){}
			if(oos != null) try{oos.close();}catch(IOException e){}	
		}
		
		// ���Ϸ� ���� ��ü ������ �о�´�.
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			
			// member.data ���Ϸ� ���� ��ü�� �о���� ��Ʈ���� �����Ѵ�.
			fis = new FileInputStream("member.data");
			ois = new ObjectInputStream(fis);
			
				int checkBoolean = 0;
				
				for(int i=0; i<3; i++)  { //���ǽ� �ٽ� �����غ���****
					
					Member read_member = (Member)ois.readObject();
					
					if(read_member.returnPw().equals(pw) && read_member.returnEmail().equals(email)) {
						
						String memberId = read_member.returnId(); // id
						if(memberId.length() < 3) { // id�� 3�� ���� �� ���
							System.out.println(memberId);
						} else { // id�� 3�� �̻� �� ���
							String id = memberId.substring(0,3); // id�� 3���ڸ� �����Ͽ� ����
							for(int length=0; i<memberId.length()-3; i++) { // �� ���Ŀ� ������ �͵��� �� ��ǥ�� �����ش�
								id += "*"; // id=id+"*";
							}
							System.out.println(id);
						}
						break;
					}
					
					checkBoolean++; // break���� ��Ÿ�� ��� ������ ��� checkBoolean�� 3�̵ȴ�
				}
				
				if(checkBoolean == 3) { // break�� �� Ż ��� �����Ͱ� ���� ��� �̹Ƿ� �� ���ǹ��� Ÿ�Եȴ�.
					System.out.println("��ȸ ��� �����Ͱ� �����ϴ�.");
				}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			// ��Ʈ���� �ݾ��ش�.
			if(fis != null) try{fis.close();}catch(IOException e){}
			if(ois != null) try{ois.close();}catch(IOException e){}
		}
		
		
	}
}
