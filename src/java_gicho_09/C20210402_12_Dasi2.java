package java_gicho_09;

import java.util.Scanner;

public class C20210402_12_Dasi2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			int pan = 0;
			while(true) {
				do {
					System.out.println("데모플레이 시작");
					if (sum<500) {
						System.out.println("동전을 투입해주세요.");
						int coin = scan.nextInt();
						sum += coin;
					}
				} while(sum<500);			
				sum = sum - 500;
				int cnt = (int)sum/500;
				if (cnt>=1) {
					System.out.printf("%d판 남았습니다/\n", cnt);
				} else {
					System.out.printf("게임이 끝났습니다.\n", cnt);
				}
				System.out.println("게임 시작");
				System.out.printf("%d원 남았습니다.\n", sum);
				System.out.printf("%d판 게임이 남았습니다.\n", sum/500);
			
			
		}
	}
}

// 500원 이하면 돈달라고 요구

