package java_gicho_10;

import java.util.Scanner;

public class C20210405_02_Sujung {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		// 성적 처리 프로그램
//		// 국어 영어 수학 : 3과목
//		System.out.println("국어 점수:");
//		int k = scan.nextInt();
//		System.out.println("영어 점수:");
//		int e = scan.nextInt();
//		System.out.println("수학 점수:");
//		int m = scan.nextInt();
//		// 배열문 이용
//		// 내가 지금 저정할 변수들이 전부다 int 타입이라서!
//		// 배열은 한가지 타입의 데이터만 저장할 수 있다.
//		int[] a = {80, 80, 80};			// 선언과 초기화를 동시에 하는 법
//		int[] b;						// 선언과 초기화를 따로 사용
//		int[] aa = null;					// 참조 데이터 타입 : null은 인정한다.
////		int d = null; 					// 오류
//		b = new int[] {80, 80, 80} ;
////		index 번호:		0	1	2
//	
		System.out.println("암호의 갯수는?");
		int q = scan.nextInt();
		int[] c = new int[q]; 	// 비어있는 인덱스 길이 4짜리 객체를 생성
		
		for(int i=0; i<q; i++) {
			System.out.println("점수를 알려주세요:");
			int d = scan.nextInt();
			c[i] = d;
		}
		
		// 총점 / 평균
//		int sum = k + e + m;
//		int avg = (sum/3);
		// 배열문 이용
		int sum2 = 0;
		for (int i=0;i<3;i++) { // i의 범위 : 0 ~ 2 : 반복횟수 3번
			sum2 = sum2 + c[i];	// 여기서 쓰인 i는 index 번호가 되더라
		}
		int avg2 = (int)(sum2/c.length); // length() 는 문자열_하나하나의 길이를 말함 length 는 배열의 길이
							//a 변수의 객체 길이 값
		// 출력
//		System.out.printf("총점: %d, 평균: %d\n", sum, avg);
		System.out.printf("총점: %d, 평균: %d", sum2, avg2);
	}
}
