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
						System.out.println("(데모플레이 시작)");
//						System.out.println("-동전을 투입해주세요-");
						System.out.printf("-동전을 투입해 주세요- \n(%d원)\n", 500-sum);
						int coin = scan.nextInt();
						sum += coin;
						System.out.printf("%d원 넣었습니다.\n", sum);
					}
				} while(sum<500);			
				sum = sum - 500;
				System.out.println("[게임 시작]");
				if (sum/500 == 0) {
					System.out.printf("%d원 남았습니다.\n", sum);
					System.out.println("게임 종료");
				} else {
					System.out.printf("%d판 게임이 더 남았습니다.\n", sum/500);
				}
			
		}
	}
}

// 500원 이하면 돈달라고 요구

