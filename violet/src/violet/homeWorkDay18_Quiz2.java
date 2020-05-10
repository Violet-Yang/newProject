//package violet;
//
//import java.awt.FlowLayout;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
///*2. JTextField로 학생번호 이름 국어점수 영어점수를 입력받아 
//총점,평균을 계산해서 student.txt파일로 저장되도록 해보세요.
//*/
//
//class MyStudent extends JFrame{
//	JLabel lbl=new JLabel("번호입력"); //JLabel : 이름입력 -> 라벨이 붙는 위치
//	JTextField studentNum=new JTextField(20); //입력을 받는 기능, 매개변수는 입력창의 크기를 나타냄
//	JLabel lbl2=new JLabel("이름입력"); //JLabel : 이름입력 -> 라벨이 붙는 위치
//	JTextField studentName=new JTextField(20); //입력을 받는 기능, 매개변수는 입력창의 크기를 나타냄
//	JLabel lbl3=new JLabel("국어점수입력"); //JLabel : 이름입력 -> 라벨이 붙는 위치
//	JTextField studentKor=new JTextField(20); //입력을 받는 기능, 매개변수는 입력창의 크기를 나타냄
//	JLabel lbl4=new JLabel("영어점수입력"); //JLabel : 이름입력 -> 라벨이 붙는 위치
//	JTextField studentEng=new JTextField(20); //입력을 받는 기능, 매개변수는 입력창의 크기를 나타냄
//	JButton btn1=new JButton("확인");
//	public MyStudent() {
//		setLayout(new FlowLayout());
//		add(lbl);
//		add(txtName);
//		add(btn1);
//		setSize(500,200);
//		setVisible(true);
//
//public class homeWorkDay18_Quiz2 {
//	public static void main(String[] args) {
//		try {
//		ObjectOutputStream oos=
//				new ObjectOutputStream(new FileOutputStream("student.txt"));
//		oos.writeObject(new String("bright thinking~"));
//		oos.writeObject(new Integer(1009));
//		oos.writeObject(new Date());
//		oos.close();
//		}catch(IOException ie) {
//			System.out.println(ie.getMessage());
//			}
//		}
//
//}
