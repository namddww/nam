package gicho10;

import java.util.Scanner;

public class C20210405_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� ó�� ���α׷�
		// ���� ���� ���� : 3����
		System.out.println("���� ����:");
		int k = scan.nextInt();
		System.out.println("���� ����:");
		int e = scan.nextInt();
		System.out.println("���� ����:");
		int m = scan.nextInt();
		
		// ���� / ���
		int sum = k + e + m;
		int avg = (sum/3);
		
		// ���
		System.out.printf("����: %d, ���: %d", sum, avg);
	}
}
