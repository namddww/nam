package java_gicho_04;
import java.util.Scanner;
public class 산술연산자_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력값:");
		String num1 = scan.nextLine(); // int 입력값
		int num2 = Integer.parseInt(num1);
		System.out.println("입력값:");
		String num3 = scan.nextLine(); // String 입력밧
		int num4 = Integer.parseInt(num3);
		
		System.out.printf("%d + %d = %d\n", num2, num4, num2+num4);
	}
}
