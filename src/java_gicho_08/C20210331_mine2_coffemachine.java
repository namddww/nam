package java_gicho_08;

import java.util.Scanner;

public class C20210331_mine2_coffemachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int cost1 = 300;
		int cost2 = 500;
		int cost3 = 800;
		int money = 0; // 초기화까지 같이 해라.(습관)
		System.out.println("메뉴를 출력합니다.");
		System.out.printf("1. 일반커피 : %d원\n", cost1);
		System.out.printf("2. 고급커피 : %d원\n", cost2);
		System.out.printf("3. 율무    : %d원\n", cost1);
		System.out.printf("4. 매밀커피 : %d원\n", cost3);
	
		System.out.println("메뉴 번호를 입력하세요.");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("일반 커피를 선택하셨습니다.");
			money = cost1;
		} else if (select == 2) {
			System.out.println("고급 커피를 선택하셨습니다.");
			money = cost2;
		} else if (select == 3) {
			System.out.println("율무를 선택하셨습니다.");
			money = cost1;
		} else if (select == 4) {
			System.out.println("매밀커피를 선택하셨습니다.");
			money = cost3;
		} else {
			System.out.println("잘못된 선택입니다.");
		}
		
//		money = 300;
		System.out.printf("동전을 투입해 주세요:%d\n", money);
		int coin = 100;
		System.out.printf("%d원을 투입하세요.(단, %d짜리만 받아요)\n", money, coin);
//		coin = scan.nextInt();
		int sum = 0;
		int a = 0;
//		int cnt = money;
		for (int i = 0; i < money; i++) {
			System.out.println("100원 투입하세요.");			
			a = scan.nextInt();
			sum += a;
		if (sum >= money) {
			System.out.println("맛있게 드세요.");
			System.out.printf("잔액은 %d원 입니다.\n", sum-money);
			break;
		} else {
			System.out.println("투입된 금액이 부족합니다.");
			System.out.printf("부족 금액은:%d\n", sum-money);
		}
		}

	}
}	
	

