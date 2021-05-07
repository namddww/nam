package java_gicho_04;
import java.util.Scanner;
public class 산술연산자_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력값:");
		String num1 = scan.nextLine(); // int 입력값
		int num2 = Integer.parseInt(num1);
		
		System.out.println("[양수]");
		System.out.println(+num2);
		System.out.println("[음수]");
		System.out.println(-num2);
		
		// 전위 연산자
		int a = num2;
		int b = ++a; // 값을 가져와서 1을 더한 뒤에 b를 저장한다.
		System.out.println("++전위 연산자");
		System.out.println(a);
		System.out.println(b);
		// 후위 연산자
		System.out.println("후위++ 연산자");
		a = num2;
		b = a++;
		System.out.println(a);
		System.out.println(b);	

		// 전위 연산자
		a = num2;
		b = --a; // 값을 가져와서 1을 뺀 뒤에 b를 저장한다.
		System.out.println("--전위 연산자");
		System.out.println(a);
		System.out.println(b);
		// 후위 연산자
		System.out.println("후위-- 연산자");
		a = num2;
		b = a--;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("++는 +1 대입");		
		num2++; // num2 = num2 + 1 과 같다(대입이 되는 것!)
		++num2;
		System.out.println(num2);
	}
}
