package java_gicho_09;
import java.util.Scanner;
public class C20210402_10_coffeemachine {
	public static void main(String[] args) {
//		// ���Ǳ� ---> ���޴� �˰��� 
//		// for���� �̿��ؼ� �Ѿ׼� / 100  ---> cnt 
//		// ������ : ������ 100¥���� �޾ƾ� �Ѵ�.
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int cost = 300;
		int coin = 0;
		int money = 0;
		
		while(run) {
			System.out.printf("%d���� �������ּ���.", cost-money);
			coin = scan.nextInt();
			money += coin;
			if (money >= cost) {
				run = false; // Ż������
				System.out.println("�ȳ���������.");
			}
			
		}
	}
}

//package kong;
//import java.util.Scanner;
//
//public class kkkk {
//
//	public static void main(String[] args) {
//		// ���Ǳ� ---> ���޴� �˰��� 
//		// for���� �̿��ؼ� �Ѿ׼� / 100  ---> cnt 
//		// ������ : ������ 100¥���� �޾ƾ� �Ѵ�.
//		boolean run = true;
//		Scanner scan = new Scanner(System.in);
//		int cost = 300;
//		int money = 0;
//		
//		while(run) {
//			System.out.printf("%d���� �������ּ���.", cost-money);
//			int coin = scan.nextInt();
//			money += coin;
//			if (money >= cost) {
//				run = false; // Ż������
//				System.out.println("�ȳ���������.");
//			}
//		}
//	}
//}