package nam;

public class Aaa {
	public static void main(String[] args) {
		a();
	
	}
	static void b() { // static �޼���� Ŭ���� ������ ������ �� ���� �����ȴ�!
		System.out.println("b");
		a();
	}
	static void a() {
		System.out.println("a");
		b();
		
	}
}


