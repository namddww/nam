package java_gicho_09;

import java.util.Scanner;

public class C20210402_12_Dasi2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			int pan = 0;
			while(true) {
				do {
					System.out.println("�����÷��� ����");
					if (sum<500) {
						System.out.println("������ �������ּ���.");
						int coin = scan.nextInt();
						sum += coin;
					}
				} while(sum<500);			
				sum = sum - 500;
				int cnt = (int)sum/500;
				if (cnt>=1) {
					System.out.printf("%d�� ���ҽ��ϴ�/\n", cnt);
				} else {
					System.out.printf("������ �������ϴ�.\n", cnt);
				}
				System.out.println("���� ����");
				System.out.printf("%d�� ���ҽ��ϴ�.\n", sum);
				System.out.printf("%d�� ������ ���ҽ��ϴ�.\n", sum/500);
			
			
		}
	}
}

// 500�� ���ϸ� ���޶�� �䱸

