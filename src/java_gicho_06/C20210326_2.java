package java_gicho_06;
import java.util.Scanner;
public class C20210326_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ����:");
		int score = scan.nextInt();
		char q = ' '; // �������
		char w = 0; // + 0		0 = ' '
		int a = score/10;
		int b = score%10; // �ſ� ���� ���̴� ����
		System.out.println(a);
		System.out.println(b);
		
		// [����Ǫ�� ��Ʈ : �ϳ��� �ٸ��� ������ ��� ����]
		
		if (a == 9 || a == 100) { // && �ڿ��� ������ �ʰ� ����
			q = 'A';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 8) {
			q = 'B';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 7) {
			q = 'C';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 6) {
			q = 'D';
			if (b >= 5) {
				w = '+'; 
			}
		}
		if (a == 5) {
			q = 'F';
			if (b >= 5) {
				w = '+'; 
			}
		}
        System.out.printf("����� ����:%c%c" , q, w);
		// ���� ó�� ���α׷�
		/*
		 * 0 ~ 100�������� ������ �Է¹޾� 90 ~ 100 : A
		 *                           80 ~  89 : B
		 *                           70 ~  79 : C
		 *                           60 ~  69 : D
		 *                            0 ~  59 : F 
		 */
	}
}
