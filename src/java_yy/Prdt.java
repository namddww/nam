package java_yy;

public class Prdt {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Buyer2 b2 = new Buyer2();
		Tv t = new Tv();
		System.out.println("Tv형식의 Tv에서 Product매개투입:"+b.go(t));
		System.out.println("Tv형식의 Tv에서 Tv매개투입:"+b2.go(t));

		System.out.println("_________________________________");
		
		Product p = new Tv();
		System.out.println("Product형식의 Tv에서 Product매개투입:"+b.go(p));
		System.out.println("Product형식의 Tv에서 Tv매개투입"+b.go(p));
		System.out.println("_________________________________");
		Tv pt = (Tv)p;
		System.out.println("(Tv)p의 number:"+pt.number);
		System.out.print("(Tv)p의 method():");
		pt.method();
		System.out.println();
		System.out.println("(Tv)p의 Product매개투입:"+b.go(pt));
		System.out.println("(Tv)p의 Tv매개투입:"+b2.go(pt));
		
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