package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Sujeong {
	public static void main(String[] args) {
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		main1();
			
		}
		
		static void main1() {
			int num = inp2();
			int[] a = new int[num];
			int result = 0;
			
			a = pp(a, num);

			result = kk(a, num);
			System.out.println("출력값 : " + result);
		}
		
		static int kk(int[] a, int num) {
			int result=0;
			switch(inpu()) {
				case "+":
					result=add(a, num);
					break;
				case "-":
					result=minus(a, num);
					break;
				case "*":
					result=mul(a, num);
					break;
				case "/":
					result=div(a, num);
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					System.exit(0);
			}
			// 여기서부터 다시 시작
//			for (int i=0;i<num;i++) {
//			}
			return result;
		}
		
		static int[] pp(int[] a, int num) {
			for(int i=0;i<num;i++) {
				a[i] = inp();
			}
			return a;
		}
		static int inp() {
			int result =0;
			Scanner scan = new Scanner(System.in);
			System.out.println("입력할 정수를 알려주세요");
			result = scan.nextInt();
			return result;
		}
		
		static int inp2() {
			int result =0;
			Scanner scan = new Scanner(System.in);
			System.out.println("몇개의 정수를 입력할건가요?");
			result = scan.nextInt();
			System.out.println(result+"개");
			return result;
		}
		
		static String inpu() {
			String result ="";
			Scanner scan = new Scanner(System.in);
			System.out.println("연산기호를 알려주세요(+, -, *, /):");
			result = scan.nextLine();
			return result;
		}
		
		static int add(int[] a, int num) {
			int result = 0;
			for(int i=0;i<num;i++) {
				result +=a[i];
			}
			return result;
		}
		
		static int minus(int[] a, int num) {
			int result = 0;
			for(int i=0;i<num;i++) {
				result -=a[i];
			}
			return result;
		}
		
		static int mul(int[] a, int num) {
			int result = 1;
			for(int i=0;i<num;i++) {
				result *=a[i];
			}
			return result;
		}
		
		static int div(int[] a, int num) {
			int result = 0;
			for(int i=0;i<num;i++) {
				result /=a[i];
			}
			return result;
	}
	
}


