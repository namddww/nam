package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Sujeong {
	public static void main(String[] args) {
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		main1();
			
		}
		
		static void main1() {
			int num = inp2();
			int[] a = new int[num];
			int result = 0;
			
			a = pp(a, num);

			result = kk(a, num);
			System.out.println("��°� : " + result);
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
					System.out.println("�߸��� �Է��Դϴ�.");
					System.exit(0);
			}
			// ���⼭���� �ٽ� ����
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
			System.out.println("�Է��� ������ �˷��ּ���");
			result = scan.nextInt();
			return result;
		}
		
		static int inp2() {
			int result =0;
			Scanner scan = new Scanner(System.in);
			System.out.println("��� ������ �Է��Ұǰ���?");
			result = scan.nextInt();
			System.out.println(result+"��");
			return result;
		}
		
		static String inpu() {
			String result ="";
			Scanner scan = new Scanner(System.in);
			System.out.println("�����ȣ�� �˷��ּ���(+, -, *, /):");
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


