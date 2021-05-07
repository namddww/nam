package java_yy_03;

public class C20210425_05 {
	public static void main(String[] args) {
		Phone p = new Phone("전화기", "현대", "화이트");
//		p.name = "전화기";
//		p.company = "현대";
//		p.color = "화이트";
		
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.recieve();
		p.get_name();
		
		SmartPhone sp = new SmartPhone();
//		sp.name = "갤럭시";
//		sp.company = "삼성";
//		sp.color = "블랙";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.recieve();
		sp.installApp();
		sp.get_name();
	}
}

class Phone {
	String name;
	String color;
	String company;
	Phone(String name, String color, String company) {
		this.name = name;
		this.color = color;
		this.company = company;
	}
	Phone() {}
	void call() {
		System.out.println("전화를 걸다.");
	}
	void recieve() {
		System.out.println("전화를 받다.");
	}
	void get_name() {
		System.out.println("Phone");
		System.out.println(this.name);
	}
}

class SmartPhone extends Phone {
	SmartPhone(String name, String color, String company) {
		this.name = name;
		this.color = color;
		this.company = company;
	}
	SmartPhone() {}
	public void installApp() {
		System.out.println("앱 설치");
	}
//	void get_name() {
//		System.out.println("SmartPhone");
//		System.out.println(this.name);
//	}
}