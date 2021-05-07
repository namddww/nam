package java_gicho_09;

import java.util.Scanner;

public class C20210402_13_Dasi {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			while(true) {
				do {
					System.out.println("데모플레이 시작");
					for(int j=3;j>0;j--) {
						System.out.printf("카운트를 시작합니다. %d\n", j);
					}
					
					if (sum<500) {
						System.out.println("동전을 투입해주세요.");
						int coin = scan.nextInt();
						sum += coin;
					}
				// break와 continue는 사용하는 것은 좋지 않다.
				}while(sum<500);
				
				sum = sum - 500;
				int cnt = (int)sum/500;
				if (cnt>=1) {
					System.out.printf("%d판 남았습니다.\n", cnt);
				} else {
					System.out.println("강제 종료합니다.(먹튀)");
					break; // break 속해있는 반복문은 지금 while문에 걸쳐있어서 바로 탈출해버린다!
				}
				// 한 판 남았습니다 이후 밑 3가지를 출력하고 싶지 않으면?
				if (cnt<=0) {
					System.out.println();
				} else {
					continue; // "cnt의 값이 1 이상이라면 아랫줄의 내용을 출력하지 않는다."
				}
				System.out.println("게임 시작");
				System.out.printf("%d원 남았습니다.\n", sum);
				System.out.println();
				
			}
			System.out.println("전원 꺼집니다.");
		}
	}
