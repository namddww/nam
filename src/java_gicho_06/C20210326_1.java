package java_gicho_06;
import java.util.Scanner;
public class C20210326_1 {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 4;
//		if (a>b) {
//			System.out.println("a�� ���� �� Ů�ϴ�.");
//		}
		// ���� ó�� ���α׷�
		/*
		 * 0 ~ 100�������� ������ �Է¹޾� 90 ~ 100 : a
		 * 							80 ~  89 : b
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
//		int a = 99;
		
		if (a >= 90) {
			System.out.println("A");
		} else if (a>= 80) {
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
