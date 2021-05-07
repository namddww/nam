package java_gicho_04;
import java.util.Scanner;
public class C20210322_2_IMPORTANT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num1 = scan.nextLine();
		int num2 = Integer.parseInt(num1);	
//		System.out.printf("입력된 값 : %f", (float)num2); // 실수형 데이터로 변환
		System.out.printf("입력된 값 : %d\n", num2); // 실수형 데이터로 변환
		num2 += 10;
		System.out.println("입력값 += 10 -> " + num2); // 여기서 +는 문자열 연결자가 된다! 문자열로 프로모션 되기 때문에!
		// 문자열 + 정수/실수 = 문자열 type으로 프로모션 한다!
		num2 -= 10;
		System.out.println("입력값 -= 10 -> " + num2);
		num2 *= 2;
		System.out.println("입력값 *= 2 -> " + num2);
		num2 /= 2;
		System.out.println("입력값 /= 2 -> " + num2);
		num2 %= 3;
		System.out.println("입력값 %= 3 -> " + num2);
	}
}
