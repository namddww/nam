package java_gicho_04;
import java.util.Scanner;
public class 외울구문정리 {
	public static void main(String[] args) {
		// 변수 입력 모드
		System.out.println("숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		int num2 = Integer.parseInt(num1);
		System.out.println(num1 + (num2+num2));
		System.out.printf("%d * %d = %d\n", num2, num2, num2*num2);

		int a = num2;
		int b = ++num2;
		System.out.println("원본 출력 | 전위연산 출력");
		System.out.println("      "+a+" | "+b);

		int c = num2;
		int d = num2++;
		System.out.println("원본 출력 | 후위연산 출력");
		System.out.println("      "+c+" | "+d);
		System.out.print("[d=num2;] 단순 =(정의) 후 +1 적용됨 : ");
		d = num2; 
		System.out.println(d);
		System.out.println("전위/후위연산은 =(정의)를 내린 후에야 +1 결과 출력.");
		System.out.println("-----------------------------------------");
		
		
		System.out.println("비교할 두 문자를 입력해 주세요.");
		// 대소문자 비교
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		if (str1 == str2) {
			System.out.println("대소문자 구분하고 두 값의 주소까지 같습니다.");
		} else if (str1.equals(str2)) {
			System.out.println("대소문자 구분하고 두 값의 값만 같습니다.(주소는 다름)");
		} else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("대소문자 구분하지 않고 같습니다.");
		} else {
			System.out.println("완전 다릅니다.");
		}
	}
}
