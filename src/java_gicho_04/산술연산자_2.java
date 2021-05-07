package java_gicho_04;
import java.util.Scanner;
public class 산술연산자_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력값:");
		String num1 = scan.nextLine(); // int 입력값
		int num2 = Integer.parseInt(num1);
		System.out.println("입력값:");
		String num3 = scan.nextLine(); // String 입력밧
		int num4 = Integer.parseInt(num3);
		
		System.out.printf("%d + %d = %d\n", num2, num4, num2+num4);
		System.out.printf("%d - %d = %d\n", num2, num4, num2-num4);
		System.out.printf("%d * %d = %d\n", num2, num4, num2*num4);
		System.out.printf("%d / %d = %f\n", num2, num4, (float)num2/num4); // 원래 나누기 연산 들어가면 무조건 실수로 변환돼야 하는데..(자바 예외사항)

		// 나머지 연산
		System.out.printf("%d %% %d = %d \n", num2, num4, (num2 % num4)); // 실제 %가 찍힐려면 %%로 찍어야 함!
		// %% : 이건 진짜 %야!!(% 한 번 찍기)
	}
}
