package java_gicho_04;
import java.util.Scanner;
public class C20210322_1 {
	public static void main(String[] args) {
		int number = 10; // 데이터 타입 변환 없음
		long n1 = 10; // 프로모션 된다.
//		int n2 = 10l; // 큰 데이터 타입을 작은 데이터 타입으로 넣으려고 하면 에러 발생 (10의 long)
		int n3 = (int)10l; // 캐스팅 : 데이터 손실 가능성을 개발자가 확인해서 실행 <강제형변환>
	System.out.println(n3);
	
	long a = (long)10.0f;	// 정수 --> 실수 OK : Promotion
	float b = 10l; 			// 실수 --> 정수 강제형 변환 필요 : Casting
	
	a = 10;		// 위쪽 a와 밑의쪽 a의 주소값은 다르다!(가비지 컬렉터: 자동 메모리 관리)
	a = a + 1;	// 데이터 공간이 기억될 필요가 없다면 삭제된다
	System.out.println(a);
	}
}


