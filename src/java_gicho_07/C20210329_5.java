package java_gicho_07;
import java.util.Scanner;
public class C20210329_5 {
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
		switch (select) {
		case 1 :
			System.out.println("�Ϲ� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost1;
			break;
		case 2 :
			System.out.println("��� Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost2;
			break;
		case 3 :
			System.out.println("������ �����ϼ̽��ϴ�.");
			money = cost1;
			break;
		case 4 :
			System.out.println("�Ź�Ŀ�Ǹ� �����ϼ̽��ϴ�.");
			money = cost3;
			break;
		default :
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		System.out.printf("������ ������ �ּ���:%d\n", money);
		int coin = scan.nextInt();
		if (coin >= money) {
			System.out.println("���ְ� �弼��.");
			System.out.printf("�ܾ��� %d", coin - money);
		} else {
			System.out.println("���Ե� �ݾ��� �����մϴ�.");
			System.out.printf("���� �ݾ���:%d\n", money - coin);
		}
	}
}	
	
	
	
