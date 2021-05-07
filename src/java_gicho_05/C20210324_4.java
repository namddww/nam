package java_gicho_05;
import java.util.Scanner;;
public class C20210324_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//[나]
//		int a = scan.nextInt();
//		String out = a >= 90 ? "A":a>=80 ? "B":"C";
//		System.out.println("값:"+out);
		
		//[선생님 식]]
		int num1 = scan.nextInt();
//		char c = num1 >=90 ? 'A' : 'B';
//		char c = num1 >=90 ? 'A' : num1>=80 ?'B':'C';
		char c = num1 >=90 ? 'A' : num1>=80 ?'B': num1>=70 ? 'C': num1>=60 ? 'D':'F';
		// 가독성이 떨어지기 때문에 이런식으로 사용하진 않는다.
		System.out.println("값:"+c);

	}
}
