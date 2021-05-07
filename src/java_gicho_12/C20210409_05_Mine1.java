package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Mine1 {
	public static void main(String[] args) {
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		int[] inin = new int[2];
		inin = inpt(inin);
		System.out.println(cal(inin, ""));
		
		
		
	}
	
	// 입력 받기
	static int inp() {
		int a=0;
		System.out.println("정수 입력:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}
	
	// 배열 만들어 값 넣기
	static int[] inpt(int[] in) {
		for (int i=0;i<2;i++) {
			in[i] = inp();
		}
		return in;
	}
	
	// 연산 받아 계산
	static int cal(int[] in, String str) {
		int result = 0;
		System.out.println("기호 입력:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		switch(str) {
		case "+" :
			result = in[0] + in[1];
			break;
		case "-" :
			result = in[0] - in[1];
			break;
		case "*" :
			result = in[0] * in[1];
			break;
		case "/" :
			result = in[0] * in[1];
			break;
		default :
				System.out.println("잘못 입력");
				System.exit(0);
		}
		return result;
	}
	
}
