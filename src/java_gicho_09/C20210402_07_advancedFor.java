package java_gicho_09;

public class C20210402_07_advancedFor {
	public static void main(String[] args) {
		int[] a = {1,2,9,4,5};
		//		   0 1 2 3 4
		for (int i : a) { // 반복 횟수 : 배열 요소의 갯수
			System.out.println(i); // 향상된 for문(프로그램 수준)
			System.out.println(a);
		}
		System.out.println();
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]); // 전통적 for문(배열 조작에 유리)
		}
		
	}
}






