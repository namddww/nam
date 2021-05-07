package java_gicho_13;
import java.util.Scanner;
public class C20210412_02_Mine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			// 임의의 예외를 생성시키기
			exfirtst();
			//NullPointerException
			int[] d = null;
			System.out.println(d[0]);
			//ArrayIndexOutofBoundsException
			int[] c = new int[3];
			System.out.println(c[3]);
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a/b);
			
			// ArithmeticException: / by Zero
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		} catch(ArrayIndexOutofBoundsException e) {
			System.out.println("배열 길이 초과!!!");
		} catch(NullPointerException e) {
			nullp();
		} catch(Exception e) { // 모든 에러
			System.out.println("에러발생 똑바로 하세요!!!");
		} finally { //else --> 무조건 동작하는 코드블럭
			System.out.println("프로그램 종료");
		}
		
	}
	static void exfirst() throws Exception{ // 문제가 발생하면 Exception으로 던져라~
		nullp();
		
	}
	static void nullp() {
		System.out.println("아니 없는걸 달라고하면 안돼요!!");
	}
}