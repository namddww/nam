package java_gicho_09;

public class C20210402_05_mine {
	public static void main(String[] args) {
		int i;
		for (i=0; i<5; i++) { // ¿£ÅÍÀÇ È½¼ö
			for (int j=5; j>i; j--) { // º°ÀÇ °¹¼ö
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
