package java_gicho_04;
import java.util.Scanner;
public class 비교연산자_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가진돈:");
		String num1 = scan.nextLine();
		int m = Integer.parseInt(num1);
		
		System.out.println("카드가 있나요?(yes/no)");
		String num2 = scan.nextLine();
		
		int money = 5000;// 택시비
//		System.out.println(m>=money && num2.equals("yes"));
		if (m>=money && num2.equals("yes")) {
		System.out.println("어서오세요. 가시는 길까지 안전하게 모시겠습니다.");
		} else {System.out.println("저리 꺼저.");
		}
		System.out.println("--논리 연산--");
		boolean a = false;
		boolean b = !(a);
		System.out.println(b);
		boolean c = !(!(a));
		System.out.println(c);
	}

}
