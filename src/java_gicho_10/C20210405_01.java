package java_gicho_10;

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
		// �迭�� �̿�
		// �迭�� �Ѱ��� Ÿ���� �����͸� ������ �� �ִ�.
		int[] a = {80, 80, 80}; // ����� �ʱ�ȭ�� ���ÿ� ���
		// �ε�����ȣ  0   1   2
		int[] b = null;         // ����� �ʱ�ȭ�� ���� ��� 
		                        // : ���� ������ Ÿ�� : null�� �����Ѵ�.
		b = new int[] {80, 80, 80};
		System.out.println("������ ������?");
		int q = scan.nextInt();
		int[] c = new int[q];  // ����ִ� �ε��� ���� 4¥�� ��ü�� ����
		
		for(int i=0; i<c.length; i++) {
			System.out.println("������ �˷��ּ���:");
			int d = scan.nextInt();
			c[i] = d;
		}
		// ���� / ���
		int sum = k + e + m;
		int avg = (int)(sum / 3);
		// �迭�� �̿�
		int sum2=0;
		for(int i=0;i<c.length;i++) {  // i�� ���� : 0 ~ 2  : �ݺ�Ƚ�� 3��
			sum2 = sum2 + c[i]; 
		}
		int avg2 = (int)(sum2/c.length);
		//                    ���� b�� ��ü ���̰� : �ε��� ����
		
		// ���
		System.out.printf("����: %d, ���: %d\n", sum, avg);
		System.out.printf("����: %d, ���: %d\n", sum2, avg2);
	}
}

