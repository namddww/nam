package java_gicho_08;

import java.util.Scanner;

// ������
public class C20210331_mine4_gugu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ������ �ܼ��� �˷��ּ���: ");
		int cnt = scan.nextInt();
		System.out.print("��� ���� �߰��� ����ұ��? ");
		int cnt2 = cnt + scan.nextInt();
		
		System.out.print("["+cnt+"��]\n");		
		System.out.print(cnt+"�ܺ���"+cnt2+"��\n");		
		System.out.print("-----------------\n");		
		for (int j=cnt; j<=cnt2; j++) {
			for (int i=1;i<10;i++) {
				System.out.printf("|%d * %d = %d\t|\n",j, i, j*i);
				}
			System.out.print("-----------------\n");		
			}
		}
}
