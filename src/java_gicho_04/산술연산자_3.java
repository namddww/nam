package java_gicho_04;
import java.util.Scanner;
public class ���������_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է°�:");
		String num1 = scan.nextLine(); // int �Է°�
		int num2 = Integer.parseInt(num1);
		
		System.out.println("[���]");
		System.out.println(+num2);
		System.out.println("[����]");
		System.out.println(-num2);
		
		// ���� ������
		int a = num2;
		int b = ++a; // ���� �����ͼ� 1�� ���� �ڿ� b�� �����Ѵ�.
		System.out.println("++���� ������");
		System.out.println(a);
		System.out.println(b);
		// ���� ������
		System.out.println("����++ ������");
		a = num2;
		b = a++;
		System.out.println(a);
		System.out.println(b);	

		// ���� ������
		a = num2;
		b = --a; // ���� �����ͼ� 1�� �� �ڿ� b�� �����Ѵ�.
		System.out.println("--���� ������");
		System.out.println(a);
		System.out.println(b);
		// ���� ������
		System.out.println("����-- ������");
		a = num2;
		b = a--;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("++�� +1 ����");		
		num2++; // num2 = num2 + 1 �� ����(������ �Ǵ� ��!)
		++num2;
		System.out.println(num2);
	}
}
