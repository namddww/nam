package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Mine2 {
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
		// ����� ���ϱ� ���� �ڵ带 ������(�� ��ü���� ��): ���1 ���2 ���3... ��:xx
		
//		switch() {
//		case 1 :
//		}
		
		
		for (int data : ab) {
			System.out.println(data);
		}
		
	}
}