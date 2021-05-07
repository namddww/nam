package java_yy_01;

public class C20210418_04 {
	public static void main(String[] args) {
		AA a = new AA();
		AA b = new AA();
		a.a = 5;
		a.b = 8;
		b.a = 2;
		b.b = 7;
		// a.a a.b b.a b.b 각 객체의 메모리 영역이 모두 다르기 때문에 값도 다를 수 밖에 없다
		System.out.println(a.a);
	}
	void cc () {
		// 함수
	}
}

class AA {
	// 기본 생성자가 생성ㄴ된다
	// AA() {}
	int a;
	int b;
	void bb () {
		// 메서드
	}
}

