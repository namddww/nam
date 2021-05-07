package java_yy_01;

public class C20210418_05 {
	public static void main(String[] args) {
	// Car[] car = new Car[3]; 이건 형태만 만든 거지 값이 없다... 값을 for문으로 만들었음!	
		Car[] car = new Car[3]; //배열의 범위 : 0 ~ 2  길이 : 3
		
		for(int i=0;i<car.length;i++) {
			car[i] = new Car();
		}
		
		for(int i = 0; i<car.length;i++) {
			System.out.printf("%d번째 차의 색깔 : %s\n" , i+1, car[i].color);
			System.out.printf("%d번째 차의 제조사 : %s\n" , i+1, car[i].company);
			System.out.printf("%d번째 차의 타입 : %s\n" , i+1, car[i].type);
		}
		System.out.println();
		car[1].color = "블랙";
		for(int i = 0; i<car.length;i++) {
			System.out.printf("%d번째 차의 색깔 : %s\n" , i+1, car[i].color);
			System.out.printf("%d번째 차의 제조사 : %s\n" , i+1, car[i].company);
			System.out.printf("%d번째 차의 타입 : %s\n" , i+1, car[i].type);
		}
		//System.out.printf("%d번째 차의 색깔 : %s" , 1, car[0].color);
	}

	
}
class Car {  //접근제한자 없음 ---> default
	Car(){}
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

