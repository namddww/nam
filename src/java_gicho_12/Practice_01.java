package java_gicho_12;
import java.util.Scanner;
public class Practice_01 {
	public static void main(String[] args) {
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		cal(inInt(), symbol());
	}
	
	static int[] inInt() {
		Scanner scan = new Scanner(System.in);
		int in = 0;
		int[] inArr = new int[2];
		for (int i=0; i<2; i++) {
			System.out.println("정수를 입력해 주세요");
			in = scan.nextInt();
			inArr[i] = in; // 차원의 수준을 맞춰야 연산이 된다![]= 1차원 더 구체적으로 나감
		}	//고차원을 굳이 저차원으로 낮춰줘야 계산 완료
//		System.out.println(inArr[1]);
		return inArr;
	}
	
	static String symbol() {
		System.out.println("+-*/를 입력해 주세요");
		Scanner scan = new Scanner(System.in);
		String symbol = scan.nextLine();
		return symbol;
	}
	
	static int cal(int[] inInt, String symbol) {
		int result = 0;
		switch (symbol) {
		case "+" :
			result = inInt[0] + inInt[1];
			break;
		case "-" :
			result = inInt[0] - inInt[1];
			break;
		case "*" :
			result = inInt[0] * inInt[1];
			break;
		case "/" :
			result = inInt[0] / inInt[1];
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		System.out.println("정답은: "+result);
		return result;
	}
}
