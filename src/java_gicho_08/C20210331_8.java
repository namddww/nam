package java_gicho_08;

import java.util.Scanner;

// ������
public class C20210331_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // �Է¹ޱ� ���� ��ü
		System.out.println("���� ������ �ܼ��� �˷��ּ���:");
		int cnt = scan.nextInt(); //3
		System.out.println("��ܱ��� ����ұ��?:");
		int cnt2 = scan.nextInt(); // 6
		
		for(int j = cnt; j<=cnt2;j++) { // 2���� ���� (cnt ~ cnt+2)
			for(int i = 1;i<10;i++) { // 9�� ����(1 ~ 9)
				System.out.printf("%d * %d = %d\n",j, i, j*i);
			}
			System.out.println();
		}
	}
}