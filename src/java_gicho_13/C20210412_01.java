package java_gicho_13;
import java.util.Scanner;
public class C20210412_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a/b);
			// ArithmeticException: / by Zero
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵſ�!!");
		} catch(Exception e) { // ��� ����
			System.out.println("�����߻� �ȹٷ� �ϼ���!!!");
		}
		
	}
}