package java_gicho_08;

import java.util.Scanner;

public class C20210331_mine2_coffemachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int cost1 = 300;
		int cost2 = 500;
		int cost3 = 800;
		int money = 0; // �ʱ�ȭ���� ���� �ض�.(����)
		System.out.println("�޴��� ����մϴ�.");
		System.out.printf("1. �Ϲ�Ŀ�� : %d��\n", cost1);
		System.out.printf("2. ���Ŀ�� : %d��\n", cost2);
		System.out.printf("3. ����    : %d��\n", cost1);
		System.out.printf("4. �Ź�Ŀ�� : %d��\n", cost3);
	
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("�Ϲ� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost1;
		} else if (select == 2) {
			System.out.println("��� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost2;
		} else if (select == 3) {
			System.out.println("������ �����ϼ̽��ϴ�.");
			money = cost1;
		} else if (select == 4) {
			System.out.println("�Ź�Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost3;
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
//		money = 300;
		System.out.printf("������ ������ �ּ���:%d\n", money);
		int coin = 100;
		System.out.printf("%d���� �����ϼ���.(��, %d¥���� �޾ƿ�)\n", money, coin);
//		coin = scan.nextInt();
		int sum = 0;
		int a = 0;
//		int cnt = money;
		for (int i = 0; i < money; i++) {
			System.out.println("100�� �����ϼ���.");			
			a = scan.nextInt();
			sum += a;
		if (sum >= money) {
			System.out.println("���ְ� �弼��.");
			System.out.printf("�ܾ��� %d�� �Դϴ�.\n", sum-money);
			break;
		} else {
			System.out.println("���Ե� �ݾ��� �����մϴ�.");
			System.out.printf("���� �ݾ���:%d\n", sum-money);
		}
		}

	}
}	
	

