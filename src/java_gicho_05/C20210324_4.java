package java_gicho_05;
import java.util.Scanner;;
public class C20210324_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//[��]
//		int a = scan.nextInt();
//		String out = a >= 90 ? "A":a>=80 ? "B":"C";
//		System.out.println("��:"+out);
		
		//[������ ��]]
		int num1 = scan.nextInt();
//		char c = num1 >=90 ? 'A' : 'B';
//		char c = num1 >=90 ? 'A' : num1>=80 ?'B':'C';
		char c = num1 >=90 ? 'A' : num1>=80 ?'B': num1>=70 ? 'C': num1>=60 ? 'D':'F';
		// �������� �������� ������ �̷������� ������� �ʴ´�.
		System.out.println("��:"+c);

	}
}
