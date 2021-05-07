package java_gicho_05;

import java.util.Scanner;

public class C20210324_1 {
	public static void main(String[] args) {
//		int ab = 7;
//		String abc = Integer.toBinaryString(ab);
//		System.out.println(abc);		// 입력된 정수를 2진수로 바꾸는 메서드
	
		Scanner scan = new Scanner(System.in);
		System.out.println("입력값을 알려주세요.");
		String s1 = scan.nextLine();
		int num1 = Integer.parseInt(s1); // 문자열에서 정수를 읽어들인다.
		String a = Integer.toBinaryString(num1); // 정수를 2진수의 문자열로 바꾼다.
		System.out.printf("%s 의 이진수값은 %s입니다.\n", s1, a);

		System.out.println("---------------------------");

		System.out.println("입력값을 알려주세요.");
		String s2 = scan.nextLine();
		int num2 = Integer.parseInt(s2); 
		String b = Integer.toBinaryString(num2);
		System.out.printf("%s 의 이진수값은 %s입니다. \n", s2, b);
		System.out.println("---------------------------");
		
		if (num1 == num2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
	
}