package java_gicho_09;

public class C20210402_04 {
	public static void main(String[] args) {
		int i;
		for (i=0; i<6; i++) { // 첫번째줄이니까 1이라고 쓴 것임_1시작이든 2시작이든 값은 같음
			for (int j=0; j<=i; j++) { // j끝과 i끝이 1차이 날때까지 반복함
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
