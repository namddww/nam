package java_gicho_10;

import java.util.Scanner;

public class C20210405_02_Sujung {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		// ���� ó�� ���α׷�
//		// ���� ���� ���� : 3����
//		System.out.println("���� ����:");
//		int k = scan.nextInt();
//		System.out.println("���� ����:");
//		int e = scan.nextInt();
//		System.out.println("���� ����:");
//		int m = scan.nextInt();
//		// �迭�� �̿�
//		// ���� ���� ������ �������� ���δ� int Ÿ���̶�!
//		// �迭�� �Ѱ��� Ÿ���� �����͸� ������ �� �ִ�.
//		int[] a = {80, 80, 80};			// ����� �ʱ�ȭ�� ���ÿ� �ϴ� ��
//		int[] b;						// ����� �ʱ�ȭ�� ���� ���
//		int[] aa = null;					// ���� ������ Ÿ�� : null�� �����Ѵ�.
////		int d = null; 					// ����
//		b = new int[] {80, 80, 80} ;
////		index ��ȣ:		0	1	2
//	
		System.out.println("��ȣ�� ������?");
		int q = scan.nextInt();
		int[] c = new int[q]; 	// ����ִ� �ε��� ���� 4¥�� ��ü�� ����
		
		for(int i=0; i<q; i++) {
			System.out.println("������ �˷��ּ���:");
			int d = scan.nextInt();
			c[i] = d;
		}
		
		// ���� / ���
//		int sum = k + e + m;
//		int avg = (sum/3);
		// �迭�� �̿�
		int sum2 = 0;
		for (int i=0;i<3;i++) { // i�� ���� : 0 ~ 2 : �ݺ�Ƚ�� 3��
			sum2 = sum2 + c[i];	// ���⼭ ���� i�� index ��ȣ�� �Ǵ���
		}
		int avg2 = (int)(sum2/c.length); // length() �� ���ڿ�_�ϳ��ϳ��� ���̸� ���� length �� �迭�� ����
							//a ������ ��ü ���� ��
		// ���
//		System.out.printf("����: %d, ���: %d\n", sum, avg);
		System.out.printf("����: %d, ���: %d", sum2, avg2);
	}
}
