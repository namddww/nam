package java_gicho_05;
import java.util.Scanner;
public class C20210324_2 {
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		//정수형에서 가장 큰 값을 불러와라.
		System.out.printf("정수의 범위 : %d ~ %d", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("11111111111111111111111111111100", 2)) ;
		//32가 아닌 31자리수를 입력해야.. 왜?! 1 자리는 부호비트라서?!?
		// 2진수값 구하기
		System.out.println(2147483644-Integer.MAX_VALUE-1) ;
	}

}

//public class C20210324_2 {
//	public static void main(String[] args) {
//		
//		System.out.println(Integer.MAX_VALUE);
//		// 정수형에서의 가장 큰 값을 불러와라.
//		System.out.printf("정수의 범위 : %d ~ %d\n",Integer.MIN_VALUE, Integer.MAX_VALUE);
//		System.out.println(Integer.parseInt("1111111111111111111111111111100",2));
//		System.out.println(2147483644-Integer.MAX_VALUE-1);
//	}
//}
