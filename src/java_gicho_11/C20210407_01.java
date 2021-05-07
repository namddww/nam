package java_gicho_11;

public class C20210407_01 {
	public static void main(String[] args) {
		int[][][] a = {{{1,2}, {3,4}}, {{5,6}, {7,8}}, {{9,10},{11,12}}, {{13,14}, {15,16}}};
//								0				1				2					3
//						  0		  1		  0	 	  1		  0       1  		 0  	  1
//						 0 1	 0 1     0 1    0  1     0 1     0  1       0  1     0  1

//		for (int k=0;k<4;k++) {
//			for (int j=0; j<2;j++) {
//				System.out.println();
//				for (int i=0; i<2;i++) {
//					System.out.println(a[k][j][i]);
//				}
//			}
//		}
		
		System.out.println();
		System.out.println(a[2][1][1]);
		System.out.println();
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0].length);
//		System.out.println(a[0][0][0].length);
	
		for (int k=0;k<a.length;k++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.println();
				for (int i=0;i<a[0][0].length;i++) {
					System.out.println(a[k][j][i]); // 내가 생성하는 자료구조가 형성된다~!
				}
			}
		}
		
		int[][] aa;
		aa = new int[][] {{1,2}, {3,4}};
//		aa[0][0] = new int[][] {5,6}; // 가변길이로 구하고 싶다! 정사/직사각형이 아닌 다각형
		
		String[] b = {"홍길동", "김씨", "나씨"};
		int[][] c = {{90, 80 ,70}, {90, 80 ,70}, {90, 80 ,70}};
		
		System.out.println();
		for (int i=0;i<b.length;i++) {
			System.out.println("["+b[i]+"]");
			for(int j=0;j<c[0].length;j++) {
				System.out.println(b[i] + ":" + c[i][j]);
			}
		}
	}
} 
