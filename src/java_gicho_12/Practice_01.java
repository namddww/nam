package java_gicho_12;
import java.util.Scanner;
public class Practice_01 {
	public static void main(String[] args) {
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		cal(inInt(), symbol());
	}
	
	static int[] inInt() {
		Scanner scan = new Scanner(System.in);
		int in = 0;
		int[] inArr = new int[2];
		for (int i=0; i<2; i++) {
			System.out.println("������ �Է��� �ּ���");
			in = scan.nextInt();
			inArr[i] = in; // ������ ������ ����� ������ �ȴ�![]= 1���� �� ��ü������ ����
		}	//�������� ���� ���������� ������� ��� �Ϸ�
//		System.out.println(inArr[1]);
		return inArr;
	}
	
	static String symbol() {
		System.out.println("+-*/�� �Է��� �ּ���");
		Scanner scan = new Scanner(System.in);
		String symbol = scan.nextLine();
		return symbol;
	}
	
	static int cal(int[] inInt, String symbol) {
		int result = 0;
		switch (symbol) {
		case "+" :
			result = inInt[0] + inInt[1];
			break;
		case "-" :
			result = inInt[0] - inInt[1];
			break;
		case "*" :
			result = inInt[0] * inInt[1];
			break;
		case "/" :
			result = inInt[0] / inInt[1];
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.exit(0);
		}
		System.out.println("������: "+result);
		return result;
	}
}
