package java_gicho_09;

import java.util.Scanner;

public class C20210402_11_coffeemachine {
		public static void main(String[] args) {
			// ���Ǳ� ---> ���޴� �˰��� 
			// for���� �̿��ؼ� �Ѿ׼� / 100  ---> cnt 
			// ������ : ������ 100¥���� �޾ƾ� �Ѵ�.
			boolean run = true;
			Scanner scan = new Scanner(System.in);
			int money = 0;
			int cost = 0;
			int cost1 = 300;
			int cost2 = 500;
			int cost3 = 800;
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
			while(run) {
				System.out.printf("%d���� �������ּ���.", money-cost);
				int coin = scan.nextInt();
				cost += coin;
				if ( cost >= money) {
					run = false; // Ż������
					System.out.println("�ȳ���������.");
				}
			}
		}
	}




