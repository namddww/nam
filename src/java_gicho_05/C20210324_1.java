package java_gicho_05;

import java.util.Scanner;

public class C20210324_1 {
	public static void main(String[] args) {
//		int ab = 7;
//		String abc = Integer.toBinaryString(ab);
//		System.out.println(abc);		// �Էµ� ������ 2������ �ٲٴ� �޼���
	
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է°��� �˷��ּ���.");
		String s1 = scan.nextLine();
		int num1 = Integer.parseInt(s1); // ���ڿ����� ������ �о���δ�.
		String a = Integer.toBinaryString(num1); // ������ 2������ ���ڿ��� �ٲ۴�.
		System.out.printf("%s �� ���������� %s�Դϴ�.\n", s1, a);

		System.out.println("---------------------------");

		System.out.println("�Է°��� �˷��ּ���.");
		String s2 = scan.nextLine();
		int num2 = Integer.parseInt(s2); 
		String b = Integer.toBinaryString(num2);
		System.out.printf("%s �� ���������� %s�Դϴ�. \n", s2, b);
		System.out.println("---------------------------");
		
		if (num1 == num2) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}
	
}