package java_gicho_08;

import java.util.Scanner;

// �ζ� ����
public class C20210331_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ζǹ�ȣ�� ������ �˷��ּ���.");
		int cnt = scan.nextInt();
		for (int i =0; i<cnt; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
	}

}
