package java_gicho_04;
import java.util.Scanner;
public class �ܿﱸ������ {
	public static void main(String[] args) {
		// ���� �Է� ���
		System.out.println("���ڸ� �Է����ּ���.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		int num2 = Integer.parseInt(num1);
		System.out.println(num1 + (num2+num2));
		System.out.printf("%d * %d = %d\n", num2, num2, num2*num2);

		int a = num2;
		int b = ++num2;
		System.out.println("���� ��� | �������� ���");
		System.out.println("      "+a+" | "+b);

		int c = num2;
		int d = num2++;
		System.out.println("���� ��� | �������� ���");
		System.out.println("      "+c+" | "+d);
		System.out.print("[d=num2;] �ܼ� =(����) �� +1 ����� : ");
		d = num2; 
		System.out.println(d);
		System.out.println("����/���������� =(����)�� ���� �Ŀ��� +1 ��� ���.");
		System.out.println("-----------------------------------------");
		
		
		System.out.println("���� �� ���ڸ� �Է��� �ּ���.");
		// ��ҹ��� ��
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		if (str1 == str2) {
			System.out.println("��ҹ��� �����ϰ� �� ���� �ּұ��� �����ϴ�.");
		} else if (str1.equals(str2)) {
			System.out.println("��ҹ��� �����ϰ� �� ���� ���� �����ϴ�.(�ּҴ� �ٸ�)");
		} else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("��ҹ��� �������� �ʰ� �����ϴ�.");
		} else {
			System.out.println("���� �ٸ��ϴ�.");
		}
	}
}
