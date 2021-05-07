package java_gicho_12;

public class C20210409_03 {
	public static void main(String[] args) {
		// 함수 ----> 기능 function
		// 데이터 초기화
		int[]a = {0, 1, 0, 1, 2, 3, 4, 1, 2, 3, 4};
		String phone1 = "";
		String phone2 = "";
		String phone3 = "";
		// 전화번호로써 사용 가능한 데이터인가? 확인
		if (a.length == 11) {
			System.out.println("전화번호 가공 가능");
		}
		// 전화번호의 1번째 블럭
		phone1 = aa(a, 0, 3);
		for(int i=0; i<3; i++) {
		}
		// 전화번호의 2번째 블럭
		phone2 = aa(a, 3, 7);
		for(int i=3; i<7; i++) {
		}
		// 전화번호의 3번째 블럭
		phone3 = aa(a, 7, 11);
		for(int i=7; i<11; i++) {
		}
		// 최종 출력
		System.out.print(phone1 + "-" + phone2 + "-" + phone3);
	}
	
	// 반복 축약
	static String aa(int[] a, int b, int c) { // a, b, c 주소 전달! 값 전달 아님!
		String phone = "";
		for(int i=b; i<c; i++) {
			phone = phone + String.valueOf(a[i]); // 정수 데이터 ---> 문자열 데이터 변환
		}
		return phone;
	}
}
