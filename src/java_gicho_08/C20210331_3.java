package java_gicho_08;

import java.util.Scanner;

public class C20210331_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 300;
		int coin = 100;
		System.out.printf("%d원을 투입하세요.(단, %d짜리만 받아요)\n", money, coin);
//		System.out.println("500원을 투입하세요.(단, 100짜리만 받아요)");
		int sum = 0;
		int cnt = money/coin;
		for (int i = 0; i < cnt; i++) {
			System.out.println("100원 투입하세요.");			
			int a = scan.nextInt();
			sum += a;
		}
		System.out.printf("투입된 금액은 %d원 입니다.", sum);
	}
}
