package java_gicho_04;
import java.util.Scanner;
public class �񱳿�����_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸�:");
		String num1 = scan.nextLine();
		String name = "kong";
		String name2 = "kong"; // �ڹٴ� ���ڿ��� ���� ��� ��Ȱ���Ѵ�.
		
		if (num1 == name) {
			System.out.println("��ҹ��� ���� && �ּ� Ž��(����)/ new Scanner");
		} else {
			System.out.println("��ҹ��� ���� && �ּ� Ž��(�ٸ�)/ new Scanner");
		}
		if (name == name2) {
			System.out.println("name == name2 �ּ� ����.(�ڹٴ� ���ڿ��� ���� ��� ��Ȱ���Ѵ�.)");
		}
		if (num1.equals(name)) { // ����Ÿ���ӿ��� ���� ���ϰ� �ʹٸ�?
			System.out.println("��ҹ��� ���� ��(��)");
		} else { System.out.println("��ҹ��� ���� ��(����)");
		}
		if (num1.equalsIgnoreCase(name)) { // ��ҹ��� ���� ����
			System.out.println("��ҹ��� ���� ����(��)");
		}  else {
			System.out.println("��ҹ��� ���� ����(����)");
		}
		
	}

}
