package java_yy_02;

public class C20210424_04 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		BB2 b = new BB2();
		System.out.println(b.add(a));
		CC2 c = new CC2();
		System.out.println(c.add(1,2,3,4,5,6,7)); // 1회성 입력: 재사용 불가..
	}
	
}
class BB2{
	int add(int[] a) { // 개발자가 배열을 만들어서 보낸다.
		int result =0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

class CC2{
	int add(int ... a) { // 개발자가 보낸 요소를 자동으로 배열로 만든다.
		int result =0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

class BBB{
	int add(int a, int b) {
		return a+b; // 반환
//		System.out.println(a+b); //도달불가능 : 에러 : 실행될 가능성이 없음
	}
}