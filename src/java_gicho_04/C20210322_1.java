package java_gicho_04;
import java.util.Scanner;
public class C20210322_1 {
	public static void main(String[] args) {
		int number = 10; // ������ Ÿ�� ��ȯ ����
		long n1 = 10; // ���θ�� �ȴ�.
//		int n2 = 10l; // ū ������ Ÿ���� ���� ������ Ÿ������ �������� �ϸ� ���� �߻� (10�� long)
		int n3 = (int)10l; // ĳ���� : ������ �ս� ���ɼ��� �����ڰ� Ȯ���ؼ� ���� <��������ȯ>
	System.out.println(n3);
	
	long a = (long)10.0f;	// ���� --> �Ǽ� OK : Promotion
	float b = 10l; 			// �Ǽ� --> ���� ������ ��ȯ �ʿ� : Casting
	
	a = 10;		// ���� a�� ������ a�� �ּҰ��� �ٸ���!(������ �÷���: �ڵ� �޸� ����)
	a = a + 1;	// ������ ������ ���� �ʿ䰡 ���ٸ� �����ȴ�
	System.out.println(a);
	}
}


