package java_gicho_04;
import java.util.Scanner;
public class �񱳿�����_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");
		String num1 = scan.nextLine();
		int m = Integer.parseInt(num1);
		
		System.out.println("ī�尡 �ֳ���?(yes/no)");
		String num2 = scan.nextLine();
		
		int money = 5000;// �ýú�
//		System.out.println(m>=money && num2.equals("yes"));
		if (m>=money && num2.equals("yes")) {
		System.out.println("�������. ���ô� ����� �����ϰ� ��ðڽ��ϴ�.");
		} else {System.out.println("���� ����.");
		}
		System.out.println("--�� ����--");
		boolean a = false;
		boolean b = !(a);
		System.out.println(b);
		boolean c = !(!(a));
		System.out.println(c);
	}

}
