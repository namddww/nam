package java_gicho_09;

public class C20210402_05 {
	public static void main(String[] args) {
		int i;
		for (i=0; i<5; i++) { // 엔터의 횟수
			for (int j=0; j<5-i; j++) { // 별의 갯수 = 5-1 했다가 오답
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}