//package violet;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Scanner;
//
///*3. �ϱ⸦ �ۼ��ϴ� ���α׷� ����� (�ּ���)
//-> ���α׷��� �����ϸ� 
//1. �ϱ� ����    2. �ϱ� �б�
//
//1���� �Է��ϸ�
//[ ������ �ϱ⸦ �ۼ��ϼ���] ��� ������ �߰� Ű����� ������ �Է��ϸ� �ش� ������ ���Ϸ� ����˴ϴ�.
//���ϸ��� ���ó�¥.txt �� ����Ǹ� c:\\�ϱ��� ������ ����˴ϴ�.(�ϱ��������� ������ ���α׷����� ������ �ݴϴ�.)
//
//1. ���ó�¥���ϱ�
//2. member.data -> ���ó�¥.txt�� ��ȯ 
//			fis = new FileInputStream("���ó�¥.txt"); -> ��Ű���� ����Ǵ°Ծƴ϶� ������ ����ǰ� ���� path �޼��� ����Ͽ� ����
//			ois = new ObjectInputStream(fis);
//
//
//2���� �Է��ϸ�
//�ϱ����������� ���ϸ�ϵ��� �������� �а���� ���ϸ��� �Է��ϸ� �ش� ������ �о�� ȭ�鿡 ����մϴ�.*/
//
//public class HomeWorkDay17_Quiz3 {
//public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
//	SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
//	
//	System.out.println("������ �ϱ⸦ �ۼ��ϼ���");
//	String memo=scan.next();
//	
//	String path = "D:\\Eclipse\\Java\\������"; //���� ���
//	File Folder = new File(path);
//
//	// �ش� ���丮�� ������� ���丮�� �����մϴ�.
//	if (!Folder.exists()) {
//		try{
//		    Folder.mkdir(); //���� �����մϴ�.
//		    System.out.println("������ �����Ǿ����ϴ�.");
//	        } 
//	        catch(Exception e){
//		    e.getStackTrace();
//		}        
//         }else {
//		System.out.println("�̹� ������ �����Ǿ� �ֽ��ϴ�.");
//	}
//    }
//}
//	
//	meno
//	Calendar time = Calendar.getInstance();
//	       
//	String format_time1 = format1.format(time.getTime());
//	String format_time2 = format2.format(time.getTime());
//	        
//	System.out.println(format_time1);
//	System.out.println(format_time2);
//	
//}
//
//}
