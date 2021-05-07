package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Mine_Check {
	public static void main(String[] args) {
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] ab = new int[3];
		ab[0] = a;
		ab[1] = b;
		ab[2] = c;
		
		// 이 프로그램이 안좋은 이유!: 방법을 구하기 위한 코드이기 보다는 답을 구하기 위한 코드이다
		// 1. 방법을 구하기 위한 코드를 만들어라(더 구체적이 됨): 방법1 방법2 방법3... 답:xx
		// 2. 캡슐화가 안되서 정리가 안됨
		
//		switch() {
//		case 1 :
//		}
		
		
		for (int data : ab) {
			System.out.println(data);
		}
		
	}
}
