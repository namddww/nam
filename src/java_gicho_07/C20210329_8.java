package java_gicho_07;
import java.util.Scanner;
public class C20210329_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �˷��ּ���");
		String name = scan.nextLine();
		
//		switch (name) {
//			case "������":
//				System.out.println("õ��");
//				break;
//			case "������":
//				System.out.println("�˲�");
//				break;
//			default:
//			System.out.println("�𸣰ھ��");
		char a = 'A';
//		char a = scan.nextLine();
		switch (a) {
			case 'A':
				System.out.println("õ��");
				break;
			case 'B':
				System.out.println("�˲�");
				break;
			default:
				System.out.println("�𸣰ھ��");
		}
	}
}	
	
	
	
