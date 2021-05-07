package java_yy_01;

public class C20210418_03 {
	public static void main(String[] args) {
		Car tico = new Car();
		Car pride =  new Car();
		
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(pride.color);
		System.out.println(tico.company);
		System.out.println(pride.company);
		System.out.println(tico.type);
		System.out.println(pride.type);
		
		Cars a = new Cars();
		System.out.println("!!"+a);
		System.out.println("!!"+a.color);
	}
}

class Car{
	String color = "화이트";
	String company = "대우";
	String type = "경차";
	
	void go() {
		System.out.println("전진");
	}
	void back() {
		System.out.println("후진");
	}
}

class Cars extends Car {
	Cars() {
	Car tico = new Car();
	Car pride = new Car();
	tico.go();
	pride.go();
	
	}
}

