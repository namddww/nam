package java_gicho_08;

import java.util.Scanner;

// ������
public class C20210331_mine3_gugu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ������ �ܼ��� �˷��ּ���: ");
		int cnt = scan.nextInt(); 
		System.out.print("["+cnt+"��]\n");		
		for (int j=cnt; j<=cnt; j++) {
			for (int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",j, i, j*i);
				}
			}
		}
}
