package java_gicho_08;

import java.util.Scanner;

// ����������
public class C20210331_6_gaibaibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int userWin = 0; //�ʱ�ȭ�� �����ָ� ������ �����.
		int comWin = 0;
		for (int i =1; i<=3;i++) {
			// ��ǻ��
			int a = ((int)(Math.random()*3)+1);
			if (a == 1) {
				System.out.println("����");
			} else if (a == 2) {
				System.out.println("����");
			} else if (a == 3) {
				System.out.println("��");
			} else {
				System.out.println("����");			
			}
			
			// User
			System.out.println("1. ���� 2. ���� 3. ���� �����ϼ���.");			
			int b = scan.nextInt();
			int p = a - b;
			if(p == 0){
			    System.out.println("[���º�]");
			} else if (p == -1 || p == 2){
				System.out.println("[�����¸�]");
				userWin++;
			} else if (p == -2 || p == 1){
				System.out.println("[��ǻ�� �¸�]");
				comWin++;
			} else {
				System.out.println("����");
			}
		}
		
		if (userWin > comWin) {
			System.out.println("--�����¸��ڴ� [user]�Դϴ�.--");
		} else if (userWin < comWin) {
			System.out.println("--�����¸��ڴ� [computer]�Դϴ�.--");
		} else if (userWin == comWin) {
			System.out.println("--���� ���º��Դϴ�.--");
		} else {
			System.out.println("����");
		}
//		int cnt = scan.nextInt();
		
		
//		for (int i =0; i<cnt; i++) {
//			System.out.println((int)(Math.random()*3)+1);
	}

}
