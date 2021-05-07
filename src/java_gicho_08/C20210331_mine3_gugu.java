package java_gicho_08;

import java.util.Scanner;

// 구구단
public class C20210331_mine3_gugu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 단수를 알려주세요: ");
		int cnt = scan.nextInt(); 
		System.out.print("["+cnt+"단]\n");		
		for (int j=cnt; j<=cnt; j++) {
			for (int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",j, i, j*i);
				}
			}
		}
}
