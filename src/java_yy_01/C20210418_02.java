package java_yy_01;

public class C20210418_02 {
	public static void main(String[] args) {
		String a = "ȫ�浿";
		String b = "ȫ�浿";				// ���� ������ ��Ȱ���Ѵ�
		String c = new String("ȫ�浿");	//��������� new�� �Է����ִ�, ���� �ּҰ��� ��Ȱ������ �ʴ´�.
		if (a == b) {
			System.out.println("a==b");
		} else if ( a == c) {
			System.out.println("a==c");
		}
	}
}

