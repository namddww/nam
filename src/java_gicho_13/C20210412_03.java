package java_gicho_13;
import java.util.Scanner;
public class C20210412_03 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			try {
				// 임의의 예외를 생성시키기
				exfirst();
				//NullPointerException
				int[] d = null;
				System.out.println(d[0]);
				//ArrayIndexOutOfBoundsException
				int[] c = new int[3];  
				System.out.println(c[3]);
				// ArithmeticException
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(a/b);
				
			}catch(ArithmeticException e) {
				System.out.println("0으로 나누면 안되요!!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 길이 초과!!!");
			}catch(NullPointerException e) {
				nullp();
			}catch(Exception e) {
				System.out.println("에러발생 똑바로 하세요!!!");
				System.out.println(e);
			}finally { //else  --> 무조건 동작하는 코드블럭
				System.out.println("프로그램 종료");
			}
			
			
		}
		static void ss() throws Exception{
			throw new Exception("예외");
		}
		static void exfirst() throws Exception {
			ss();
		}
		static void nullp() {
			System.out.println("아니 없는걸 달라고하면 안되요!!!");	
		
	}
}