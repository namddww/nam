package java_yy_02;

public class C20210424_02 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		Fish f1 = new Fish();
		Bird2 b2 = new Bird2();
		b1.move();
		f1.move();
		b2.move();
//		b1.name;
		System.out.println(b1.name);
		System.out.println(f1.name);
//		System.out.println(f1.move());
		System.out.println(b2.move());
//		static void Go() {
//			System.out.println("GoGo");
//		}
	}
}

class Bird2 {
	String name = "��";
	String move() {
		return "return �� �����ϱ� println ��� ����! void�� println ��� �Ұ�~!";
	}
}

class Bird {
	String name = "��";
	void move() {
		System.out.println("fiy");
	}
}

class Fish {
	String name = "�����";
	void move() {
	System.out.println("swim");
	}
}

class Animal {
	Bird b = new Bird();
	Fish f = new Fish();
	//	b.move();
	//	f.move();
	//	b.name;
	//	System.out.println(b.name);
}
	