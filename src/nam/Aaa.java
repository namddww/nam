package nam;

public class Aaa {
	public static void main(String[] args) {
		a();
	
	}
	static void b() { // static 메서드는 클래스 공간을 구성할 때 같이 구성된다!
		System.out.println("b");
		a();
	}
	static void a() {
		System.out.println("a");
		b();
		
	}
}


