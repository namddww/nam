package java_gicho_08;
import java.util.Scanner;
public class C20210331_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for(int i=0; i<=10; i++) { // i는 for문 안에서 선언되었으므로 종료되면 사라짐
			System.out.println(i); // ctn 값은 for문이 종료되더라도 남아있어
			cnt++;					// cnt 누적합
		}
		System.out.printf("최종 반복 횟수: %d", cnt);

		for(int i=0; i<=10; i+=2) { 
			System.out.println(i); 
			cnt++;
		}
		System.out.printf("최종 반복 횟수: %d", cnt);
	}
}
