package java_gicho_07;
import java.util.Scanner;
public class C20210329_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		// ���̽����� ������ ����� ����!: ������ ���α׷���
		switch (a) {
		case 12: // ���̽� 12�� �����ϰ�, ������ ���α׷������� ��������
		case 1: // ���̽� 1�� �����ϰ�, ������ ���α׷������� ��������
		case 2: // ���̽� 2�� �����ϰ�, ������ ���α׷������� ��������
			System.out.println("�ܿ��Դϴ�.");
			break;
			// break �� switch ���� �������´� : break ������ �ڵ尡 ���δ�.
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		default : 
			// ���̽����� ��Ī�Ǵ� ���� ���� ��� default�� �б��Ѵ�.
			System.out.println("�̷��� ����?");
		}
		System.out.println("����");
		
//		���̽� 3 ���� �� ��, 4 ���� �� ��, 5���� �� print
		
		if (a == 12 || a <= 2) {
			System.out.println("�ܿ��Դϴ�.");	
		}
		else if (a <= 5) {
			System.out.println("���Դϴ�.");	
		}
		else if (a <= 8) {
			System.out.println("�����Դϴ�.");	
		}
		else if (a <= 11) {
			System.out.println("�����Դϴ�.");	
		}
		else {
			System.out.println("�̷��� ����?");	
		}
		System.out.println("����");	
	}

}
