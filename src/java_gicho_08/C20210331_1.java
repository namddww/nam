package java_gicho_08;
import java.util.Scanner;
public class C20210331_1 {
	public static void main(String[] args) {
		// 1 ~ 100까지의 총합을 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		for(int i=1; i<=100; i++) { // i는 for문 안에서 선언되었으므로 종료되면 사라짐
//			System.out.println(i); 	// ctn 값은 for문이 종료되더라도 남아있어
			sum += i; 				// sum = sum+i; 
			cnt++;					// cnt 누적합
			// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			// 만들어진 수열의 갯수 : 반복 횟수
		}
		System.out.printf("최종 반복 횟수: %d \n", cnt);
		System.out.printf("누적 합: %d", sum);
		System.out.println();
	}
}
