package java_gicho_04;
import java.util.Scanner;
public class 비교연산자_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:");
		String num1 = scan.nextLine();
		String name = "kong";
		String name2 = "kong"; // 자바는 문자열이 같은 경우 재활용한다.
		
		if (num1 == name) {
			System.out.println("대소문자 구분 && 주소 탐색(같음)/ new Scanner");
		} else {
			System.out.println("대소문자 구분 && 주소 탐색(다름)/ new Scanner");
		}
		if (name == name2) {
			System.out.println("name == name2 주소 같음.(자바는 문자열이 같은 경우 재활용한다.)");
		}
		if (num1.equals(name)) { // 참조타입임에도 값을 비교하고 싶다면?
			System.out.println("대소문자 구분 함(참)");
		} else { System.out.println("대소문자 구분 함(거짓)");
		}
		if (num1.equalsIgnoreCase(name)) { // 대소문자 구분 안함
			System.out.println("대소문자 구분 안함(참)");
		}  else {
			System.out.println("대소문자 구분 안함(거짓)");
		}
		
	}

}
