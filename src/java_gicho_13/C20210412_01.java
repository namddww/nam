package java_gicho_13;
import java.util.Scanner;
public class C20210412_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a/b);
			// ArithmeticException: / by Zero
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		} catch(Exception e) { // 모든 에러
			System.out.println("에러발생 똑바로 하세요!!!");
		}
		
	}
}