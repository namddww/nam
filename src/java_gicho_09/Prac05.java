package java_gicho_09;
import java.util.Scanner;
public class Prac05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int cost = 300;
		int coin = 0;
		int money = 0;
		
		while(run) {
			System.out.printf("%d���� �����ϼ���.", cost-coin);
			coin = scan.nextInt();
			money += coin;
			if (money >= cost) {
				System.out.println("�ȳ���������.");
				run = false;
			}
		}
	}
}
