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
///*2. JTextField�� �л���ȣ �̸� �������� ���������� �Է¹޾� 
//����,����� ����ؼ� student.txt���Ϸ� ����ǵ��� �غ�����.
//*/
//
//class MyStudent extends JFrame{
//	JLabel lbl=new JLabel("��ȣ�Է�"); //JLabel : �̸��Է� -> ���� �ٴ� ��ġ
//	JTextField studentNum=new JTextField(20); //�Է��� �޴� ���, �Ű������� �Է�â�� ũ�⸦ ��Ÿ��
//	JLabel lbl2=new JLabel("�̸��Է�"); //JLabel : �̸��Է� -> ���� �ٴ� ��ġ
//	JTextField studentName=new JTextField(20); //�Է��� �޴� ���, �Ű������� �Է�â�� ũ�⸦ ��Ÿ��
//	JLabel lbl3=new JLabel("���������Է�"); //JLabel : �̸��Է� -> ���� �ٴ� ��ġ
//	JTextField studentKor=new JTextField(20); //�Է��� �޴� ���, �Ű������� �Է�â�� ũ�⸦ ��Ÿ��
//	JLabel lbl4=new JLabel("���������Է�"); //JLabel : �̸��Է� -> ���� �ٴ� ��ġ
//	JTextField studentEng=new JTextField(20); //�Է��� �޴� ���, �Ű������� �Է�â�� ũ�⸦ ��Ÿ��
//	JButton btn1=new JButton("Ȯ��");
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
