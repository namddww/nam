package java_gicho_09;

import java.util.Scanner;

public class C20210402_11_coffeemachine_Dasi_Mine {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int cost1 = 300;
			int cost2 = 500;
			int cost3 = 800;
			int money = 0;
			System.out.println("�޴��� ����մϴ�.");
			System.out.printf("1. �Ϲ�Ŀ�� : %d��\n", cost1);
			System.out.printf("2. ���Ŀ�� : %d��\n", cost2);
			System.out.printf("3. ������   : %d��\n", cost1);
			System.out.printf("4. �޹�Ŀ��   : %d��\n", cost3);
			
			System.out.println("�޴� ��ȣ�� �Է��ϼ���:");
			int select = scan.nextInt();
			/*
			if (select == 1) {
				System.out.println("�Ϲ� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				money = cost1;
			}else if (select == 2) {
				System.out.println("��� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				money = cost2;
			}else if (select == 3) {
				System.out.println("�������� �����ϼ̽��ϴ�.");
				money = cost1;
			}else if (select == 4) {
				System.out.println("�޹�Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				money = cost3;
			}else {
				System.out.println("�߸��� �����Դϴ�.");
			}
			*/
			switch (select) {
				case 1:
					System.out.println("�Ϲ� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
					money = cost1;
					break;
				case 2:
					System.out.println("��� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
					money = cost2;
					break;
				case 3:
					System.out.println("�������� �����ϼ̽��ϴ�.");
					money = cost1;
					break;
				case 4:
					System.out.println("�޹�Ŀ�Ǹ� �����ϼ̽��ϴ�.");
					money = cost3;
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
			}
			
			System.out.printf("������ �������ּ���:%d\n", money);
			int coin = scan.nextInt();
			boolean run = true; // �� �� ����
			int sum = 0;
			while (run) {
				sum += coin;
				if (money <= sum) {
					System.out.println("���ְ� �弼��~~");
					System.out.printf("�ܾ���:%d", sum-money);
					run = false;
				}else {
					System.out.println("���Ե� �ݾ��� �����մϴ�.");
					System.out.printf("���� �ݾ���:%d\n", sum-money);
					coin = scan.nextInt();
			}
		}
	}
}



