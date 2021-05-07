package java_yy_03;

public class C20210425_01 {
	C20210425_01(){  }
	public static void main(String[] args) {
		Car1 car = new Car1();
		System.out.println(car.color +" "+ car.geartype + " " + car.door);
		
		Car1 car1 = new Car1("red", "manual", 5);
		System.out.println(car1.color +" "+ car1.geartype + " " + car1.door);
		
		Car1 car2 = new Car1("blue", "auto");
		System.out.println(car2.color +" "+ car2.geartype + " " + car2.door);
		
		// ��ü ���� : car ��ü --> ���� car3
		//Car1 car3 = car; // ���� ��ü
		Car1 car3 = new Car1(car);
		System.out.println(car3.color +" "+ car3.geartype + " " + car3.door);
	}

}
class Car1{
	String color;     // ������ ����
	String geartype;  // ���Ÿ�� : ���� / �ڵ�
	int door;         // ���� ���� : 4 / 2 / 5
	
	Car1(){
		this("white", "auto", 4);
		/*
		 *this.color = "white";
		 *this.geartype = "auto";
		 *this.door = 4;
		 */
	}
	
	Car1(String color, String geartype){
		this(color, geartype, 4);
		/*
		 *this.color = color;
		 *this.geartype = geartype;
		 *this.door = 4;
		 */
	}
	
	Car1(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	////////////////////////////////////////
	
	Car1(Car1 c){ // ��ü�� �����ϱ� ���� ������
		this.color = c.color;
		this.geartype = c.geartype;
		this.door = c.door;
	}
}