package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Mine_Check {
	public static void main(String[] args) {
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] ab = new int[3];
		ab[0] = a;
		ab[1] = b;
		ab[2] = c;
		
		// �� ���α׷��� ������ ����!: ����� ���ϱ� ���� �ڵ��̱� ���ٴ� ���� ���ϱ� ���� �ڵ��̴�
		// 1. ����� ���ϱ� ���� �ڵ带 ������(�� ��ü���� ��): ���1 ���2 ���3... ��:xx
		// 2. ĸ��ȭ�� �ȵǼ� ������ �ȵ�
		
//		switch() {
//		case 1 :
//		}
		
		
		for (int data : ab) {
			System.out.println(data);
		}
		
	}
}
