package java_gicho_06;
import java.util.Scanner;
public class C20210326_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수:");
		int score = scan.nextInt();
		char q = ' '; // 학점등급
		char w = '0'; //  + 0
		int a = score/10;
		int b = score%10;
		System.out.println(a);
		System.out.println(b);
		if (9 == a || a ==10) {
			q = 'A';       
		}else if (8 == a) {
        	q = 'B';       
        }else if (7 == a) {
            q = 'C';    
        }else if (6 == a) { 
            q = 'D';
        }else if (0 <= a && a <=5) {
        	q = 'F';
        	w = ' ';
		}else {
			System.out.println("그러지말라고요.");
		}
        if (b>=5 && a>=6 || a == 10) {
			w ='+';
		}
        
        System.out.printf("당신의 학점:%c%c", q, w);
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

