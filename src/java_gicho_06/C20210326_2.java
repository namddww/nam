package java_gicho_06;
import java.util.Scanner;
public class C20210326_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수:");
		int score = scan.nextInt();
		char q = ' '; // 학점등급
		char w = 0; // + 0		0 = ' '
		int a = score/10;
		int b = score%10; // 매우 자주 쓰이는 전개
		System.out.println(a);
		System.out.println(b);
		
		// [문제푸는 힌트 : 하나만 다르고 나머진 모두 같다]
		
		if (a == 9 || a == 100) { // && 뒤에는 보지도 않고 실행
			q = 'A';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 8) {
			q = 'B';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 7) {
			q = 'C';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 6) {
			q = 'D';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 5) {
			q = 'F';
			if (b >= 5) {
				w = '+'; 
			}
		}
        System.out.printf("당신의 학점:%c%c" , q, w);
		// 성적 처리 프로그램
		/*
		 * 0 ~ 100점까지의 점수를 입력받아 90 ~ 100 : A
		 *                           80 ~  89 : B
		 *                           70 ~  79 : C
		 *                           60 ~  69 : D
		 *                            0 ~  59 : F 
		 */
	}
}
