package java_gicho_01_03;

public class C20210319 {
	public static void main(String[] args) {
		float a = 123.123454789123456789f; 
		// 쓰레기 데이터(가비지 데이터) : float 사용하는 경우 오차가
		// 0.0000004 만큼 오차 발생함 왜? 표현 범위를 벗어나몃서.. over_flow 되기 때문
		double b = 123.123456789123456789;
		// 자바의 실수 기본 타입은 double
		// 요즘 자바의 실수: 기본 double 타입
		// 오버플로우 : 담을 수 있는 양을 초과함
		System.out.printf("%f", a);
		
		int c = 5;
		long d = 10;
		
		char bd = 'H';
		
	}
}
