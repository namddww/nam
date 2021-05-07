package java_gicho_10;

import java.util.Scanner;

public class C20210405_04_lotto_teacher2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			for (int l=0; l<=100;l++) {
				int[] lotto = new int[45];
				int cnt = 0;
				for(int k=0;k<45;k++) {
					cnt +=1;
					lotto[k] += cnt;
				}
				for(int i=0; i<45; i++) { // 45를 수정함에 따라 동작속도가 올라가지만, 줄일수록 중복값...
					int a = (int)((Math.random()*45));
					int b = (int)((Math.random()*45));
					
					
					//swap
					int tempa = lotto[a];
					int tempb = lotto[b];
					lotto[a] = tempb;
					lotto[b] = tempa;
					
				}
				for(int j=0; j<6;j++) {
					System.out.println(lotto[j]);
			}
				System.out.println();
		}
	}
}

// 22   24
// 24   22

// lotto[22] 3 5	lotto[24] 5
// lotto[24] 5 3	lotto[22] 3

// 23   23 : 중복값? NO..이건 아님;;