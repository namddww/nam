package java_gicho_12;
import java.util.Scanner;
public class Practice_02 {
	public static void main(String[] args) {
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		int fori = 	forInt();
//		inInt(fori);
		cal(fori, inInt(fori), symbol());
	}
	
//  순차수열 만들기(인덱스)
//	static int[] forInt() {
//		System.out.println("연산할 숫자 갯수를 입력해 주세요.");
//		Scanner scan = new Scanner(System.in);
//		int fori = scan.nextInt();
//		int[] fora = new int[fori];
//		int a =0;
//		for (int i=0; i<fori; i++) {
//			fora[i] = a++;
//		System.out.println(fora[i]);
//		}
////		System.out.println(fora[3]);
//		return fora;
//	}
	
	static int forInt() {
		System.out.println("연산할 숫자 갯수를 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		int fori = scan.nextInt();
		return fori;
	}
	
	static int[] inInt(int fori) {
		Scanner scan = new Scanner(System.in);
		int in = 0;
		int[] inArr = new int[fori];
		for (int i=0; i<fori; i++) {
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
	
	static int cal(int fori, int[] inInt, String symbol) {
		int result = 0;
		int resultMul = 1;
		for (int i=0; i<fori; i++) {
			switch (symbol) {
			case "+" :
				result += inInt[i];
				break;
			case "-" :
				result -= inInt[i];
				break;
			case "*" :
				resultMul *= inInt[i];
				result = resultMul;
				break;
				여기 다시!
//			case "/" :
//				resultMul = inInt[0];
//				resultMul /= inInt[i];
//				result = resultMul;
//				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
		}
		}
		System.out.println("정답은: "+result);
		return result;
	}
	
	
//	static int cal(int[] inInt, String symbol, int fori) {
//		int result = 0;
//		switch (symbol) {
//		case "+" :
//			result = inInt[0] + inInt[1];
//			break;
//		case "-" :
//			result = inInt[0] - inInt[1];
//			break;
//		case "*" :
//			result = inInt[0] * inInt[1];
//			break;
//		case "/" :
//			result = inInt[0] / inInt[1];
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//			System.exit(0);
//		}
//		System.out.println("정답은: "+result);
//		return result;
//	}
}
