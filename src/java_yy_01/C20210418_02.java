package java_yy_01;

public class C20210418_02 {
	public static void main(String[] args) {
		String a = "홍길동";
		String b = "홍길동";				// 값이 같으니 재활용한다
		String c = new String("홍길동");	//명시적으로 new를 입력해주니, 굳이 주소값을 재활용하지 않는다.
		if (a == b) {
			System.out.println("a==b");
		} else if ( a == c) {
			System.out.println("a==c");
		}
	}
}

