package java_yy_03;

public class C20210425_05 {
	public static void main(String[] args) {
		Phone p = new Phone("��ȭ��", "����", "ȭ��Ʈ");
//		p.name = "��ȭ��";
//		p.company = "����";
//		p.color = "ȭ��Ʈ";
		
		System.out.println("Phone ���");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.recieve();
		p.get_name();
		
		SmartPhone sp = new SmartPhone();
//		sp.name = "������";
//		sp.company = "�Ｚ";
//		sp.color = "��";
		
		System.out.println("SmartPhone ���");
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
		System.out.println("��ȭ�� �ɴ�.");
	}
	void recieve() {
		System.out.println("��ȭ�� �޴�.");
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
		System.out.println("�� ��ġ");
	}
//	void get_name() {
//		System.out.println("SmartPhone");
//		System.out.println(this.name);
//	}
}