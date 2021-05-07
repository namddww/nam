package java_gicho_10;

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
		// 배열문 이용
		// 배열은 한가지 타입의 데이터만 저장할 수 있다.
		int[] a = {80, 80, 80}; // 선언과 초기화를 동시에 사용
		// 인덱스번호  0   1   2
		int[] b = null;         // 선언과 초기화를 따로 사용 
		                        // : 참조 데이터 타입 : null을 인정한다.
		b = new int[] {80, 80, 80};
		System.out.println("과목의 갯수는?");
		int q = scan.nextInt();
		int[] c = new int[q];  // 비어있는 인덱스 길이 4짜리 객체를 생성
		
		for(int i=0; i<c.length; i++) {
			System.out.println("점수를 알려주세요:");
			int d = scan.nextInt();
			c[i] = d;
		}
		// 총점 / 평균
		int sum = k + e + m;
		int avg = (int)(sum / 3);
		// 배열문 이용
		int sum2=0;
		for(int i=0;i<c.length;i++) {  // i의 범위 : 0 ~ 2  : 반복횟수 3번
			sum2 = sum2 + c[i]; 
		}
		int avg2 = (int)(sum2/c.length);
		//                    변수 b의 객체 길이값 : 인덱스 길이
		
		// 출력
		System.out.printf("총점: %d, 평균: %d\n", sum, avg);
		System.out.printf("총점: %d, 평균: %d\n", sum2, avg2);
	}
}

