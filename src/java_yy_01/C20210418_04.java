package java_yy_01;

public class C20210418_04 {
	public static void main(String[] args) {
		AA a = new AA();
		AA b = new AA();
		a.a = 5;
		a.b = 8;
		b.a = 2;
		b.b = 7;
		// a.a a.b b.a b.b �� ��ü�� �޸� ������ ��� �ٸ��� ������ ���� �ٸ� �� �ۿ� ����
		System.out.println(a.a);
	}
	void cc () {
		// �Լ�
	}
}

class AA {
	// �⺻ �����ڰ� �������ȴ�
	// AA() {}
	int a;
	int b;
	void bb () {
		// �޼���
	}
}

