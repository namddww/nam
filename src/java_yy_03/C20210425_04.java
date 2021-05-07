package java_yy_03;

public class C20210425_04 {
		public static void main(String[] args) {
			Final f = new Final(200);
			System.out.println(f.number); // 100 : 변경불가
			System.out.println(f.num); // 200 : 생성자 호출 시 입력된 값으로 초기화된다.
		}

	}
	class Final{
		static final int number;
		final int num;
		static {
			number = 100;
		}
		Final(int a){
			num = a;
		}
	}
