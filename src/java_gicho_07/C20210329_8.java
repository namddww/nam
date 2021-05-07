package java_gicho_07;
import java.util.Scanner;
public class C20210329_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 알려주세요");
		String name = scan.nextLine();
		
//		switch (name) {
//			case "공현식":
//				System.out.println("천재");
//				break;
//			case "공연우":
//				System.out.println("똥꼬");
//				break;
//			default:
//			System.out.println("모르겠어요");
		char a = 'A';
//		char a = scan.nextLine();
		switch (a) {
			case 'A':
				System.out.println("천재");
				break;
			case 'B':
				System.out.println("똥꼬");
				break;
			default:
				System.out.println("모르겠어요");
		}
	}
}	
	
	
	
