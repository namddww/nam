package java_gicho_01_03;
import java.util.Scanner;
public class C20210319_4 {
	public static void main(String[] args) {
		String a = "kong";
		String b = null;
		String c = "kong";
		String cc = "kong "; //������ �߰��ϸ� index �迭�� 5���� �ż�.. ���� ����
		String d = new String("kong"); //��������� ���θ����! : �׳� ���θ����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		System.out.println(a.equals(c)); //a�� c�� ���� ���϶�! true? ���� �ּҸ� ����Ѵ�!
		System.out.println(a.equals(cc)); //a�� c�� ���� ���϶�! false? ���� �ּҸ� ����Ѵ�
	
		if (c == d) { // ==�� �ּҸ� ���Ѵ�.
			System.out.println("���� �ּҴ� ����.");
		} else {
			System.out.println("���� �ּҴ� �ٸ���.");
		} System.out.println(d.equals(c)); // ���� ��: true = ����!
		
	}

}
