package java_gicho_09;
import java.util.Scanner;
public class C20210402_10_coffeemachine {
	public static void main(String[] args) {
//		// 자판기 ---> 돈받는 알고리즘 
//		// for문을 이용해서 총액수 / 100  ---> cnt 
//		// 문제점 : 무조건 100짜리만 받아야 한다.
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int cost = 300;
		int coin = 0;
		int money = 0;
		
		while(run) {
			System.out.printf("%d원을 투입해주세요.", cost-money);
			coin = scan.nextInt();
			money += coin;
			if (money >= cost) {
				run = false; // 탈출조건
				System.out.println("안녕히가세요.");
			}
			
		}
	}
}

//package kong;
//import java.util.Scanner;
//
//public class kkkk {
//
//	public static void main(String[] args) {
//		// 자판기 ---> 돈받는 알고리즘 
//		// for문을 이용해서 총액수 / 100  ---> cnt 
//		// 문제점 : 무조건 100짜리만 받아야 한다.
//		boolean run = true;
//		Scanner scan = new Scanner(System.in);
//		int cost = 300;
//		int money = 0;
//		
//		while(run) {
//			System.out.printf("%d원을 투입해주세요.", cost-money);
//			int coin = scan.nextInt();
//			money += coin;
//			if (money >= cost) {
//				run = false; // 탈출조건
//				System.out.println("안녕히가세요.");
//			}
//		}
//	}
//}