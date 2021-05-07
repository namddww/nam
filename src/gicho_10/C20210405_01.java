package gicho10;

import java.util.Scanner;

public class C20210405_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 성적 처리 프로그램
		// 국어 영어 수학 : 3과목
		System.out.println("국어 점수:");
		int k = scan.nextInt();
		System.out.println("영어 점수:");
		int e = scan.nextInt();
		System.out.println("수학 점수:");
		int m = scan.nextInt();
		
		// 총점 / 평균
		int sum = k + e + m;
		int avg = (sum/3);
		
		// 출력
		System.out.printf("총점: %d, 평균: %d", sum, avg);
	}
}
