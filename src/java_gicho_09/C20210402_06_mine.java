package java_gicho_09;

public class C20210402_06_mine {
	public static void main(String[] args) {
		int i;
		for(i=0;i<=4;i++) {  // 0, 1, 2, 3, 4
			int j;
			for(j=4;j>i; j--) {
				System.out.print("  "); // µÎÄ­ ¶ç¿ò : Ä­ ¶ç¿ì´Â°Ô ÇÑ°³ Â÷ÀÌ³ª¸é ÇÇ¶ó¹Ìµå
			}
				for(int k=1;k<=j+1; k++) {
					System.out.print("* "); // ÇÑÄ­ ¶ç¿ò
			}
			System.out.println();		
		}
	}
}