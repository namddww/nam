package java_gicho_10;

import java.util.Scanner;

public class C20210405_04_lotto_MIneTest {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
//			for (int l=0; l<=100;l++) {
//				int[] lotto = new int[45];
//				int cnt = 0;
//				for(int k=0;k<45;k++) {
//					cnt +=1;
//					lotto[k] += cnt;
//				}
				int a[] = new int [45];
				boolean run = true;
				for(int i=0; i<44; i++) { 
					a[i] = (int)((Math.random()*45));
					while (run) {
					for (int j=0; j<6; j++) {
						if (a[j] == a[i]) {
							run = false;
						}
					}
//					int b = (int)((Math.random()*45));
					
					
					//swap
//					int tempa = lotto[a];
//					int tempb = lotto[b];
//					lotto[a] = tempb;
//					lotto[b] = tempa;
					
				}
				for(int j=0; j<6;j++) {
					System.out.println(a[j]);
//			}
//				System.out.println();
		}
	}
		
		}
}


// 22   24
// 24   22

// lotto[22] 3 5	lotto[24] 5
// lotto[24] 5 3	lotto[22] 3

// 23   23 : 중복값? NO..이건 아님;;