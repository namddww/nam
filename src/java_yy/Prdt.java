package java_yy;

public class Prdt {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Buyer2 b2 = new Buyer2();
		Tv t = new Tv();
		System.out.println("Tv������ Tv���� Product�Ű�����:"+b.go(t));
		System.out.println("Tv������ Tv���� Tv�Ű�����:"+b2.go(t));

		System.out.println("_________________________________");
		
		Product p = new Tv();
		System.out.println("Product������ Tv���� Product�Ű�����:"+b.go(p));
		System.out.println("Product������ Tv���� Tv�Ű�����"+b.go(p));
		System.out.println("_________________________________");
		Tv pt = (Tv)p;
		System.out.println("(Tv)p�� number:"+pt.number);
		System.out.print("(Tv)p�� method():");
		pt.method();
		System.out.println();
		System.out.println("(Tv)p�� Product�Ű�����:"+b.go(pt));
		System.out.println("(Tv)p�� Tv�Ű�����:"+b2.go(pt));
		
	}
}

class Product {
	int number = 10;
	void method() {
		System.out.println("Product");
	}
}
class Tv extends Product {
	int number = 20;
	void method() {
		System.out.println("Tv");
	}
}
class Buyer {
	int go(Product p) {
		return p.number;
	}
}	
class Buyer2 {
	int go(Tv p) {
		return p.number;
	}
}

class Video extends Product {
	int number = 30;
	void method() {
		System.out.println("Video");
	}
}