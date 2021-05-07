package java_gicho_08;

import java.util.Scanner;

// 구구단
public class C20210331_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 단수를 알려주세요: ");
		int cnt = scan.nextInt();
		System.out.print("몇개의 단을 출력할까요?");
		int cnt2 = scan.nextInt();
		
		System.out.print("["+cnt+"단]\n");		
		System.out.print(cnt+"단부터"+cnt2+"개의 단\n");		
		System.out.print("-----------------\n");		
		for (int j=cnt; j<cnt+cnt2; j++) {
			for (int i=1;i<10;i++) {
				System.out.printf("|%d * %d = %d\t|\n",j, i, j*i);
				}
			System.out.print("-----------------\n");		
			}
		}
}
