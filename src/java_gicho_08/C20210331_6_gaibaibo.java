package java_gicho_08;

import java.util.Scanner;

// 가위바위보
public class C20210331_6_gaibaibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int userWin = 0; //초기화를 안해주면 오류가 생긴다.
		int comWin = 0;
		for (int i =1; i<=3;i++) {
			// 컴퓨터
			int a = ((int)(Math.random()*3)+1);
			if (a == 1) {
				System.out.println("가위");
			} else if (a == 2) {
				System.out.println("바위");
			} else if (a == 3) {
				System.out.println("보");
			} else {
				System.out.println("에러");			
			}
			
			// User
			System.out.println("1. 가위 2. 바위 3. 보를 선택하세요.");			
			int b = scan.nextInt();
			int p = a - b;
			if(p == 0){
			    System.out.println("[무승부]");
			} else if (p == -1 || p == 2){
				System.out.println("[유저승리]");
				userWin++;
			} else if (p == -2 || p == 1){
				System.out.println("[컴퓨터 승리]");
				comWin++;
			} else {
				System.out.println("에러");
			}
		}
		
		if (userWin > comWin) {
			System.out.println("--최종승리자는 [user]입니다.--");
		} else if (userWin < comWin) {
			System.out.println("--최종승리자는 [computer]입니다.--");
		} else if (userWin == comWin) {
			System.out.println("--최종 무승부입니다.--");
		} else {
			System.out.println("오류");
		}
//		int cnt = scan.nextInt();
		
		
//		for (int i =0; i<cnt; i++) {
//			System.out.println((int)(Math.random()*3)+1);
	}

}
