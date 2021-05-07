package java_gicho_09;

import java.util.Scanner;

public class C20210402_11_coffeemachine {
		public static void main(String[] args) {
			// 자판기 ---> 돈받는 알고리즘 
			// for문을 이용해서 총액수 / 100  ---> cnt 
			// 문제점 : 무조건 100짜리만 받아야 한다.
			boolean run = true;
			Scanner scan = new Scanner(System.in);
			int money = 0;
			int cost = 0;
			int cost1 = 300;
			int cost2 = 500;
			int cost3 = 800;
			System.out.println("메뉴를 출력합니다.");
			System.out.printf("1. 일반커피 : %d원\n", cost1);
			System.out.printf("2. 고급커피 : %d원\n", cost2);
			System.out.printf("3. 율무차   : %d원\n", cost1);
			System.out.printf("4. 메밀커피   : %d원\n", cost3);
			
			System.out.println("메뉴 번호를 입력하세요:");
			int select = scan.nextInt();
			/*
			if (select == 1) {
				System.out.println("일반 커피를 선택하셨습니다.");
				money = cost1;
			}else if (select == 2) {
				System.out.println("고급 커피를 선택하셨습니다.");
				money = cost2;
			}else if (select == 3) {
				System.out.println("율무차를 선택하셨습니다.");
				money = cost1;
			}else if (select == 4) {
				System.out.println("메밀커피를 선택하셨습니다.");
				money = cost3;
			}else {
				System.out.println("잘못된 선택입니다.");
			}
			*/
			switch (select) {
				case 1:
					System.out.println("일반 커피를 선택하셨습니다.");
					money = cost1;
					break;
				case 2:
					System.out.println("고급 커피를 선택하셨습니다.");
					money = cost2;
					break;
				case 3:
					System.out.println("율무차를 선택하셨습니다.");
					money = cost1;
					break;
				case 4:
					System.out.println("메밀커피를 선택하셨습니다.");
					money = cost3;
					break;
				default:
					System.out.println("잘못된 선택입니다.");
			}
			while(run) {
				System.out.printf("%d원을 투입해주세요.", money-cost);
				int coin = scan.nextInt();
				cost += coin;
				if ( cost >= money) {
					run = false; // 탈출조건
					System.out.println("안녕히가세요.");
				}
			}
		}
	}




