package java_gicho_04;
import java.util.Scanner;
public class ���������_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է°�:");
		String num1 = scan.nextLine(); // int �Է°�
		int num2 = Integer.parseInt(num1);
		System.out.println("�Է°�:");
		String num3 = scan.nextLine(); // String �Է¹�
		int num4 = Integer.parseInt(num3);
		
		System.out.printf("%d + %d = %d\n", num2, num4, num2+num4);
		System.out.printf("%d - %d = %d\n", num2, num4, num2-num4);
		System.out.printf("%d * %d = %d\n", num2, num4, num2*num4);
		System.out.printf("%d / %d = %f\n", num2, num4, (float)num2/num4); // ���� ������ ���� ���� ������ �Ǽ��� ��ȯ�ž� �ϴµ�..(�ڹ� ���ܻ���)

		// ������ ����
		System.out.printf("%d %% %d = %d \n", num2, num4, (num2 % num4)); // ���� %�� �������� %%�� ���� ��!
		// %% : �̰� ��¥ %��!!(% �� �� ���)
	}
}
