//package violet;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Scanner;
//
///*3. 일기를 작성하는 프로그램 만들기 (최성진)
//-> 프로그램을 실행하면 
//1. 일기 쓰기    2. 일기 읽기
//
//1번을 입력하면
//[ 오늘의 일기를 작성하세요] 라는 문구가 뜨고 키보드로 문장을 입력하면 해당 문장이 파일로 저장됩니다.
//파일명은 오늘날짜.txt 로 저장되며 c:\\일기장 폴더에 저장됩니다.(일기장폴더가 없으면 프로그램에서 생성해 줍니다.)
//
//1. 오늘날짜구하기
//2. member.data -> 오늘날짜.txt로 변환 
//			fis = new FileInputStream("오늘날짜.txt"); -> 패키지에 저장되는게아니라 폴더에 저장되게 변경 path 메서드 사용하여 설정
//			ois = new ObjectInputStream(fis);
//
//
//2번을 입력하면
//일기장폴더안의 파일목록들이 보여지고 읽고싶은 파일명을 입력하면 해당 내용을 읽어와 화면에 출력합니다.*/
//
//public class HomeWorkDay17_Quiz3 {
//public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
//	SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
//	
//	System.out.println("오늘의 일기를 작성하세요");
//	String memo=scan.next();
//	
//	String path = "D:\\Eclipse\\Java\\새폴더"; //폴더 경로
//	File Folder = new File(path);
//
//	// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
//	if (!Folder.exists()) {
//		try{
//		    Folder.mkdir(); //폴더 생성합니다.
//		    System.out.println("폴더가 생성되었습니다.");
//	        } 
//	        catch(Exception e){
//		    e.getStackTrace();
//		}        
//         }else {
//		System.out.println("이미 폴더가 생성되어 있습니다.");
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
