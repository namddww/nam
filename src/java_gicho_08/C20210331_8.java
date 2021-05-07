package java_gicho_08;

import java.util.Scanner;

// 구구단
public class C20210331_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // 입력받기 위한 객체
		System.out.println("시작 구구단 단수를 알려주세요:");
		int cnt = scan.nextInt(); //3
		System.out.println("몇단까지 출력할까요?:");
		int cnt2 = scan.nextInt(); // 6
		
		for(int j = cnt; j<=cnt2;j++) { // 2번만 동작 (cnt ~ cnt+2)
			for(int i = 1;i<10;i++) { // 9번 동작(1 ~ 9)
				System.out.printf("%d * %d = %d\n",j, i, j*i);
			}
			System.out.println();
		}
	}
}