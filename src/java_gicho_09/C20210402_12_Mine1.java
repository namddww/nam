package java_gicho_09;

import java.util.Scanner;

public class C20210402_12_Mine1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			int pan = 0;
			while(true) {
				do {
					if (sum<500) {
						System.out.println("(�����÷��� ����)");
//						System.out.println("-������ �������ּ���-");
						System.out.printf("-������ ������ �ּ���- \n(%d��)\n", 500-sum);
						int coin = scan.nextInt();
						sum += coin;
						System.out.printf("%d�� �־����ϴ�.\n", sum);
					}
				} while(sum<500);			
				sum = sum - 500;
				System.out.println("[���� ����]");
				if (sum/500 == 0) {
					System.out.printf("%d�� ���ҽ��ϴ�.\n", sum);
					System.out.println("���� ����");
				} else {
					System.out.printf("%d�� ������ �� ���ҽ��ϴ�.\n", sum/500);
				}
			
		}
	}
}

// 500�� ���ϸ� ���޶�� �䱸

