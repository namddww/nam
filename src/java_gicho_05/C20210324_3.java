package java_gicho_05;

import java.util.Scanner;

public class C20210324_3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");
		int num1 = scan.nextInt(); // ���������� �ٷ� �޾Ƶ��δ�.
		System.out.println("������:");
		int num2 = scan.nextInt(); // ���������� �ٷ� �޾Ƶ��δ�.
		
//		int max = num1 > num2 ? num1:num2;
//		int max = num1 > num2 ? num1:num2;
		int max = num1 > num2 ? num1:num1 == num2 ? 0:num2;	//���� ��
		//		  ___________				: ����
		//						____		: True
		//	 						 ____   : False
		
		System.out.printf("�Էµ� �� �� ū ���� %d", max);
	}
}

