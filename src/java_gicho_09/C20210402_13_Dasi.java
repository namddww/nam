package java_gicho_09;

import java.util.Scanner;

public class C20210402_13_Dasi {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			while(true) {
				do {
					System.out.println("�����÷��� ����");
					for(int j=3;j>0;j--) {
						System.out.printf("ī��Ʈ�� �����մϴ�. %d\n", j);
					}
					
					if (sum<500) {
						System.out.println("������ �������ּ���.");
						int coin = scan.nextInt();
						sum += coin;
					}
				// break�� continue�� ����ϴ� ���� ���� �ʴ�.
				}while(sum<500);
				
				sum = sum - 500;
				int cnt = (int)sum/500;
				if (cnt>=1) {
					System.out.printf("%d�� ���ҽ��ϴ�.\n", cnt);
				} else {
					System.out.println("���� �����մϴ�.(��Ƣ)");
					break; // break �����ִ� �ݺ����� ���� while���� �����־ �ٷ� Ż���ع�����!
				}
				// �� �� ���ҽ��ϴ� ���� �� 3������ ����ϰ� ���� ������?
				if (cnt<=0) {
					System.out.println();
				} else {
					continue; // "cnt�� ���� 1 �̻��̶�� �Ʒ����� ������ ������� �ʴ´�."
				}
				System.out.println("���� ����");
				System.out.printf("%d�� ���ҽ��ϴ�.\n", sum);
				System.out.println();
				
			}
			System.out.println("���� �����ϴ�.");
		}
	}
