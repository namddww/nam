package java_yy_01;

public class C20210418_03_Mine {
	public static void main(String[] args) {
		Car1 tico = new Car1();
		Car1 pride =  new Car1();
		
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(pride.color);
		System.out.println(tico.company);
		System.out.println(pride.company);
		System.out.println(tico.type);
		System.out.println(pride.type);
		
		Cars1 a = new Cars1();
		System.out.println("!!"+a);
		System.out.println("!!"+a.color);
	}
}

class Car1{
	String color = "ȭ��Ʈ";
	String company = "���";
	String type = "����";
	
	void go() {
		System.out.println("����");
	}
	void back() {
		System.out.println("����");
	}
}

class Cars1 extends Car1 {
	Cars1() {
	Car1 tico = new Car1();
	Car1 pride = new Car1();
	tico.go();
	pride.go();
	
	}
}

