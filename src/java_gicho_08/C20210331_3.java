package java_gicho_08;

import java.util.Scanner;

public class C20210331_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 300;
		int coin = 100;
		System.out.printf("%d���� �����ϼ���.(��, %d¥���� �޾ƿ�)\n", money, coin);
//		System.out.println("500���� �����ϼ���.(��, 100¥���� �޾ƿ�)");
		int sum = 0;
		int cnt = money/coin;
		for (int i = 0; i < cnt; i++) {
			System.out.println("100�� �����ϼ���.");			
			int a = scan.nextInt();
			sum += a;
		}
		System.out.printf("���Ե� �ݾ��� %d�� �Դϴ�.", sum);
	}
}
