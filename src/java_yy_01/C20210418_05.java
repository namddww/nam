package java_yy_01;

public class C20210418_05 {
	public static void main(String[] args) {
	// Car[] car = new Car[3]; �̰� ���¸� ���� ���� ���� ����... ���� for������ �������!	
		Car[] car = new Car[3]; //�迭�� ���� : 0 ~ 2  ���� : 3
		
		for(int i=0;i<car.length;i++) {
			car[i] = new Car();
		}
		
		for(int i = 0; i<car.length;i++) {
			System.out.printf("%d��° ���� ���� : %s\n" , i+1, car[i].color);
			System.out.printf("%d��° ���� ������ : %s\n" , i+1, car[i].company);
			System.out.printf("%d��° ���� Ÿ�� : %s\n" , i+1, car[i].type);
		}
		System.out.println();
		car[1].color = "��";
		for(int i = 0; i<car.length;i++) {
			System.out.printf("%d��° ���� ���� : %s\n" , i+1, car[i].color);
			System.out.printf("%d��° ���� ������ : %s\n" , i+1, car[i].company);
			System.out.printf("%d��° ���� Ÿ�� : %s\n" , i+1, car[i].type);
		}
		//System.out.printf("%d��° ���� ���� : %s" , 1, car[0].color);
	}

	
}
class Car {  //���������� ���� ---> default
	Car(){}
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

