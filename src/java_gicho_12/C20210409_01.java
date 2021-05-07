package java_gicho_12;

public class C20210409_01 {
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
		for(int i=0; i<3; i++) {
//			System.out.println(phone);
			phone1 = phone1 + String.valueOf(a[i]); // 정수 데이터 ---> 문자열 데이터 변환
		}
		// 전화번호의 2번째 블럭
		for(int i=3; i<7; i++) {
//			System.out.println(phone);
			phone2 = phone2 + String.valueOf(a[i]); // 정수 데이터 ---> 문자열 데이터 변환
		}
		// 전화번호의 3번째 블럭
		for(int i=7; i<11; i++) {
//			System.out.println(phone);
			phone3 = phone3 + String.valueOf(a[i]); // 정수 데이터 ---> 문자열 데이터 변환
		}
		// 최종 출력
		System.out.print(phone1 + "-" + phone2 + "-" + phone3);
	}
	// 함수 작성 ---> 기능 : 데이터를 받아서 문자열을 합쳐주는 기능 필요
	// 반복해서 사용한다.
	static String aa(int[] a) {
		String phone = "";
		for(int i=0; i<3; i++) {
			phone = phone + String.valueOf(a[i]); // 정수 데이터 ---> 문자열 데이터 변환
		}
		return phone;
	}
}
