package java_yy_02;

public class C20210424_01 {

	public static void main(String[] args) {
		// Ŭ���� ����� ��� : ���� �޼��尡 ȣ��Ǳ����� ���� ��ϵȴ�.
		System.out.println("BB.b= " + BB.b); // 10
		//                 --     : static�����ȿ��� Ŭ������ �̸��� ���� �������� ����
		// �ν��Ͻ� ����� ��� : ��ü�� �����Ǿ�߸� �����Ѵ�.
		//System.out.println(BB.a);
		BB a = new BB();
		// �ν��Ͻ��� ���� --> ������� : int a / int b / aa() / bb()
		//                          ------          -----        : �ν��Ͻ� ���
		//                                   -----         ----  : Ŭ���� ���
		System.out.println("[.a=�ν��Ͻ�, .b=����ƽ]"); // 5
		System.out.println(a.a); // 5
		System.out.println(a.b); // 10
		BB b = new BB();
		System.out.println(b.a); // 5
		System.out.println(b.b); // 10
		System.out.println("�޶���");
		System.out.println("[a=��, b=��]"); // 5
		a.a = 20;
		System.out.println(a.a); // 20
		System.out.println(b.a); // 5
		BB.b = 50;
		System.out.println(a.b); // 50
		System.out.println(b.b); // 50
		
		// �޼���
		BB.bb(); // ��� ���� : Ŭ���� ��� �޼���
//		BB.aa(); �ν��Ͻ� ��� �޼����̱� ������ BB������ �������� �ʴ´�.
		a.aa();
		b.aa();
		a.bb(); // �Ǳ� ������ ��� ��! : ����ƽ �޼���� ����ƽ���� �ҷ��ּ���
	}
}

class BB{
	int a = 5;
	static int b = 10;
	void aa() {
		System.out.println("�� �ν��Ͻ� �����!");
		System.out.println(a); // 5 ��ӹ��� ���� a
		int a = 100; // �������� : �ν��Ͻ��� �����Ǿ�߸� �����Ѵ�.
		System.out.println(a); // 100 �������� a
	}
	static void bb() {
		System.out.println("�� Ŭ���� �����!");
	}
}
