package java_gicho_01_03;
import java.util.Scanner;
public class C20210319_3 {
	public static void main(String[] args) {
		System.out.print("�̸��� �˷��ּ���:");
		Scanner scan = new Scanner(System.in);
	//	Scanner Ŭ����   ������        �ý������� �Է�(ǥ���Է���ġ�� �Է°��� �޴´� = Ű������ �Է°��� �޴´�.) ��ǻ�� ǥ�� �����ġ: �����
	//	Scanner Ŭ������ ��ü�� ����� �� �ȿ� Ű���� �Է°��� �����ض� �׸��� �װ�ü�� �ּҸ� scan ������ ����
		Scanner scan2 = new Scanner(System.in);
		
		String name = scan.nextLine(); //nextLine() ����� ���� �Է°��� ���ڿ��� �о����!
	//				  ���� scan�� ���󰡼� ��ü�ȿ� �ִ� ���ڿ��� �о����
		System.out.printf("���� �̸���: %s�Դϴ�.\n", name);
		System.out.println("���̸� �˷��ּ���: ");
		String s1 = scan.nextLine();
		int age = Integer.parseInt(s1);
		System.out.printf("���� ���̴�: %d�Դϴ�.", age);
	}

}