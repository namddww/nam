package java_gicho_07;
import java.util.Scanner;
public class C20210329_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		// 케이스문은 순서가 상관이 없다!: 절차적 프로그래밍
		switch (a) {
		case 12: // 케이스 12를 동작하고, 절차적 프로그래밍으로 내려간다
		case 1: // 케이스 1를 동작하고, 절차적 프로그래밍으로 내려간다
		case 2: // 케이스 2를 동작하고, 절차적 프로그래밍으로 내려간다
			System.out.println("겨울입니다.");
			break;
			// break 로 switch 문을 빠져나온다 : break 단위로 코드가 묶인다.
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default : 
			// 케이스문에 매칭되는 값이 없는 경우 default로 분기한다.
			System.out.println("이러면 좋니?");
		}
		System.out.println("종료");
		
//		케이스 3 선택 후 빈값, 4 선택 후 빈값, 5선택 후 print
		
		if (a == 12 || a <= 2) {
			System.out.println("겨울입니다.");	
		}
		else if (a <= 5) {
			System.out.println("봄입니다.");	
		}
		else if (a <= 8) {
			System.out.println("여름입니다.");	
		}
		else if (a <= 11) {
			System.out.println("가을입니다.");	
		}
		else {
			System.out.println("이러면 좋니?");	
		}
		System.out.println("종료");	
	}

}
