package java_gicho_12;
import java.util.Scanner;
public class C20210409_04_MIne {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		// 정수 입력받고 배열을 만든 후 +-*/ 연산을 하는 프로그램을 만들어라
		int[] inin = new int[2];
		inin = arr(inin);
		String strIn = new String();
//		str(strIn, inin);
		System.out.println(str(strIn, inin));
		
	}	
	
	// 입력 받기 (int)
	 static int inpt() { // 메서드 바로 실행하기 위해서는 static 그렇지 않으면 객체로 만들어서 블라블라...
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		a = scan.nextInt();
		return a;
	}
	 
	 // 배열 만들기
	 static int[] arr(int[] in) {
		 for (int i = 0; i<2; i++) {
			 in[i] = inpt();
		 }
		 return in;
	 }
	 
	 // 입력 받고 계산 (+-*/)
	 static int str(String str, int[] in) {
		 System.out.println("기호를 입력하세요.");
		 Scanner scan = new Scanner(System.in);
		 str = scan.nextLine();
		 int result = 0;
		 switch (str) {
			 case "+" : 
				 result = in[0] + in[1];
				 System.out.println("[+ 활성화]");
				 break;
			 case "-" : 
				 result = in[0] - in[1];
				 System.out.println("[- 활성화]");
				 break;
			 case "*" : 
				 result = in[0] * in[1];
				 System.out.println("[* 활성화]");
				 break;
			 case "/" : 
				 result = in[0] / in[1];
				 System.out.println("[/ 활성화]");
				 break;
			default:
				System.out.println("잘못된 입력입니다.");
				System.exit(0);
		 }
		 return result;
	 }
}
	 
