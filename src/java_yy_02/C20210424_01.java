package java_yy_02;

public class C20210424_01 {

	public static void main(String[] args) {
		// 클래스 멤버의 경우 : 메인 메서드가 호출되기전에 사전 등록된다.
		System.out.println("BB.b= " + BB.b); // 10
		//                 --     : static영역안에는 클래스의 이름과 같은 영역으로 구분
		// 인스턴스 멤버의 경우 : 객체가 생성되어야만 존재한다.
		//System.out.println(BB.a);
		BB a = new BB();
		// 인스턴스를 생성 --> 구성요소 : int a / int b / aa() / bb()
		//                          ------          -----        : 인스턴스 멤버
		//                                   -----         ----  : 클래스 멤버
		System.out.println("[.a=인스턴스, .b=스태틱]"); // 5
		System.out.println(a.a); // 5
		System.out.println(a.b); // 10
		BB b = new BB();
		System.out.println(b.a); // 5
		System.out.println(b.b); // 10
		System.out.println("달라짐");
		System.out.println("[a=전, b=후]"); // 5
		a.a = 20;
		System.out.println(a.a); // 20
		System.out.println(b.a); // 5
		BB.b = 50;
		System.out.println(a.b); // 50
		System.out.println(b.b); // 50
		
		// 메서드
		BB.bb(); // 사용 가능 : 클래스 멤버 메서드
//		BB.aa(); 인스턴스 멤버 메서드이기 때문에 BB영역에 존재하지 않는다.
		a.aa();
		b.aa();
		a.bb(); // 되긴 하지만 경고가 뜸! : 스태틱 메서드는 스태틱으로 불러주세요
	}
}

class BB{
	int a = 5;
	static int b = 10;
	void aa() {
		System.out.println("난 인스턴스 멤버야!");
		System.out.println(a); // 5 상속받은 변수 a
		int a = 100; // 지역변수 : 인스턴스가 생성되어야만 존재한다.
		System.out.println(a); // 100 지역변수 a
	}
	static void bb() {
		System.out.println("난 클래스 멤버야!");
	}
}
