package java_gicho_08;

import java.util.Scanner;

public class C20210331_mine1_coffemachine {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int cost1 = 300;
			int cost2 = 500;
			int money = 0;
			System.out.println("�޴��� ����մϴ�.");
			System.out.printf("1. �Ϲ�Ŀ�� : %d��\n", cost1);
			System.out.printf("2. ���Ŀ�� : %d��\n", cost2);
			System.out.printf("3. ������   : %d��\n", cost1);
			
			System.out.println("�޴� ��ȣ�� �Է��ϼ���:");
			int select = scan.nextInt();
			if (select == 1) {
				System.out.println("�Ϲ� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				money = cost1;
			}else if (select == 2) {
				System.out.println("��� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				money = cost2;
			}else if (select == 3) {
				System.out.println("�������� �����ϼ̽��ϴ�.");
				money = cost1;
			}else {
				System.out.println("�߸��� �����Դϴ�.");
			}
			System.out.printf("������ �������ּ���:%d\n", money);
			
			money = 300;
			int coin = 100;
			System.out.printf("%d���� �����ϼ���.(��, %d¥���� �޾ƿ�)\n", money, coin);
			int sum = 0;
			int cnt = money/coin;
			for (int i = 0; i < cnt; i++) {
				System.out.println("100�� �����ϼ���.");			
				int a = scan.nextInt();
				sum += a;
			}
			System.out.printf("���Ե� �ݾ��� %d�� �Դϴ�.", sum);

//			int coin = scan.nextInt();
//			
//			if (coin >= money) {
//				System.out.println("���ְ� �弼��~~");
//				System.out.printf("�ܾ���:%d", coin-money);
//			}else {
//				System.out.println("���Ե� �ݾ��� �����մϴ�.");
//				
//		}
			System.out.printf("���� �ݾ���:%d", sum-money);
	}
}

