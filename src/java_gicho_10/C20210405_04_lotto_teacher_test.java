package java_gicho_10;

import java.util.Scanner;

public class C20210405_04_lotto_teacher_test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[45];
		int cnt = 0;
		for(int k=0;k<45;k++) {
			cnt +=1;
			lotto[k] += cnt;
		}
		
			int a = 24;
			int b = 22;
			//swap
			int tempa = lotto[a];
			int tempb = lotto[b];
			lotto[a] = tempb;
			lotto[b] = tempa;
			a = 22;
			b = 24;
			System.out.println(lotto[22]);
			System.out.println(lotto[24]);
			//swap
			tempa = lotto[a];
			tempb = lotto[b];
			lotto[a] = tempb;
			lotto[b] = tempa;
			System.out.println(lotto[22]);
			System.out.println(lotto[24]);
			
			
		}
	}
