package java_gicho_05;

import java.util.Scanner;

public class C20210324_3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값:");
		int num1 = scan.nextInt(); // 정수값으로 바로 받아들인다.
		System.out.println("정수값:");
		int num2 = scan.nextInt(); // 정수값으로 바로 받아들인다.
		
//		int max = num1 > num2 ? num1:num2;
//		int max = num1 > num2 ? num1:num2;
		int max = num1 > num2 ? num1:num1 == num2 ? 0:num2;	//내가 함
		//		  ___________				: 조건
		//						____		: True
		//	 						 ____   : False
		
		System.out.printf("입력된 값 중 큰 값은 %d", max);
	}
}

