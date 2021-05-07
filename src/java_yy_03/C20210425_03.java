package java_yy_03;

public class C20210425_03 {
	public static void main(String[] args) {
			CC c = new CC();
			System.out.println(c.c); //직접 참조
			System.out.println(c.get()); //간접 참조
			//c.com = "현대"; 에러
			c.set("현대");
			//BB a = new BB(); // 생성자 호출 막힘 : private
			BB d = BB.get();
			System.out.println(d.geta()); // 10
			d.seta(20);
			System.out.println(d.geta()); // 20
			
			BB e = BB.get();
			System.out.println(e.geta());// 새로 생성되었다면 10의 결과
			                             // 기존 객체의 주소가 반환되었다면 20의 결과
		}

	}
	class BB{
		private int a = 10;
		private static final BB single = new BB();
		
		private BB() {}
		
		//getter ---> 객체에 존재하는 정보를 외부에 유출시킨다.
		// 내부 정보를 직접 참조하는 것을 막고
		// 요청된 정보에 대해 외부로 나가는 정보를 통제할 수 있다.
		static BB get() {
			return single;
		}
		int geta() {
			return this.a;
		}
		void seta(int num) {
			this.a = num;
		}
	}

	class CC{
		String c = "blue";
		private String com = "기아";
		
		String get() { //내부 정보중 개발자가 허용한 정보만 보여준다.
			return this.com; // getter
		}
		void set(String a) { // setter
			this.com = a;
	}
}

