package java_gicho_13;
import java.util.Scanner;
public class C20210412_02_Mine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			// ������ ���ܸ� ������Ű��
			exfirtst();
			//NullPointerException
			int[] d = null;
			System.out.println(d[0]);
			//ArrayIndexOutofBoundsException
			int[] c = new int[3];
			System.out.println(c[3]);
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a/b);
			
			// ArithmeticException: / by Zero
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵſ�!!");
		} catch(ArrayIndexOutofBoundsException e) {
			System.out.println("�迭 ���� �ʰ�!!!");
		} catch(NullPointerException e) {
			nullp();
		} catch(Exception e) { // ��� ����
			System.out.println("�����߻� �ȹٷ� �ϼ���!!!");
		} finally { //else --> ������ �����ϴ� �ڵ��
			System.out.println("���α׷� ����");
		}
		
	}
	static void exfirst() throws Exception{ // ������ �߻��ϸ� Exception���� ������~
		nullp();
		
	}
	static void nullp() {
		System.out.println("�ƴ� ���°� �޶���ϸ� �ȵſ�!!");
	}
}