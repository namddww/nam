package java_gicho_04;
import java.util.Scanner;
public class C20210322_2_IMPORTANT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num1 = scan.nextLine();
		int num2 = Integer.parseInt(num1);	
//		System.out.printf("�Էµ� �� : %f", (float)num2); // �Ǽ��� �����ͷ� ��ȯ
		System.out.printf("�Էµ� �� : %d\n", num2); // �Ǽ��� �����ͷ� ��ȯ
		num2 += 10;
		System.out.println("�Է°� += 10 -> " + num2); // ���⼭ +�� ���ڿ� �����ڰ� �ȴ�! ���ڿ��� ���θ�� �Ǳ� ������!
		// ���ڿ� + ����/�Ǽ� = ���ڿ� type���� ���θ�� �Ѵ�!
		num2 -= 10;
		System.out.println("�Է°� -= 10 -> " + num2);
		num2 *= 2;
		System.out.println("�Է°� *= 2 -> " + num2);
		num2 /= 2;
		System.out.println("�Է°� /= 2 -> " + num2);
		num2 %= 3;
		System.out.println("�Է°� %= 3 -> " + num2);
	}
}
