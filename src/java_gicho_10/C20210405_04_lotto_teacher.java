package java_gicho_10;

import java.util.Scanner;

public class C20210405_04_lotto_teacher {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int[] lotto = new int[45];
			int cnt = 0;
			for(int k=0;k<45;k++) {
				cnt +=1;
				lotto[k] += cnt;
			}
			for(int i=0; i<45; i++) { // 45를 수정함에 따라 동작속도가 올라가지만, 줄일수록 중복값...
				int a = (int)((Math.random()*45));
				int b = (int)((Math.random()*45));
				System.out.println("("+i+")번째");		
				
////				int b = a;
//				
//				int last = lotto[a-1]
//				int temp = lotto[a]
				
				//swap
				int tempa = lotto[a];
				int tempb = lotto[b];
				System.out.println("tempa: " + lotto[a]);
				System.out.println("tempb: " + lotto[b]);

				lotto[a] = tempb;
				lotto[b] = tempa;
				
				System.out.println("lotto[a]: " + lotto[a]);
				System.out.println("lotto[b]: " + lotto[b]);
				System.out.println("lotto["+a+"]에는 " + lotto[a]);
				System.out.println("lotto["+b+"]에는 " + lotto[b]);
				System.out.println();
			for(int l=0; l<6; l++) {		
				System.out.println("["+l+"]: "+lotto[l]);
			}
				System.out.println();
			}
//			for(int l=0; l<6; l++) {		
//				System.out.println(lotto[l]);
//			}
			System.out.println("lotto[0] : "+lotto[0]);
			System.out.println("lotto[1] : "+lotto[1]);
			System.out.println("lotto[2] : "+lotto[2]);
			System.out.println("lotto[3] : "+lotto[3]);
			System.out.println("lotto[4] : "+lotto[4]);
			System.out.println("lotto[5] : "+lotto[5]);
			System.out.println();
			for(int j=0; j<6;j++) {
				System.out.println(lotto[j]);
		}
	}
}

// 22   24
// 24   22

// lotto[22] 3 5	lotto[24] 5
// lotto[24] 5 3	lotto[22] 3

// 23   23 : 중복값? NO..이건 아님;;