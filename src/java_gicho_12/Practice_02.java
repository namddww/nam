package java_gicho_12;
import java.util.Scanner;
public class Practice_02 {
	public static void main(String[] args) {
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		int fori = 	forInt();
//		inInt(fori);
		cal(fori, inInt(fori), symbol());
	}
	
//  �������� �����(�ε���)
//	static int[] forInt() {
//		System.out.println("������ ���� ������ �Է��� �ּ���.");
//		Scanner scan = new Scanner(System.in);
//		int fori = scan.nextInt();
//		int[] fora = new int[fori];
//		int a =0;
//		for (int i=0; i<fori; i++) {
//			fora[i] = a++;
//		System.out.println(fora[i]);
//		}
////		System.out.println(fora[3]);
//		return fora;
//	}
	
	static int forInt() {
		System.out.println("������ ���� ������ �Է��� �ּ���.");
		Scanner scan = new Scanner(System.in);
		int fori = scan.nextInt();
		return fori;
	}
	
	static int[] inInt(int fori) {
		Scanner scan = new Scanner(System.in);
		int in = 0;
		int[] inArr = new int[fori];
		for (int i=0; i<fori; i++) {
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
	
	static int cal(int fori, int[] inInt, String symbol) {
		int result = 0;
		int resultMul = 1;
		for (int i=0; i<fori; i++) {
			switch (symbol) {
			case "+" :
				result += inInt[i];
				break;
			case "-" :
				result -= inInt[i];
				break;
			case "*" :
				resultMul *= inInt[i];
				result = resultMul;
				break;
				���� �ٽ�!
//			case "/" :
//				resultMul = inInt[0];
//				resultMul /= inInt[i];
//				result = resultMul;
//				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.exit(0);
		}
		}
		System.out.println("������: "+result);
		return result;
	}
	
	
//	static int cal(int[] inInt, String symbol, int fori) {
//		int result = 0;
//		switch (symbol) {
//		case "+" :
//			result = inInt[0] + inInt[1];
//			break;
//		case "-" :
//			result = inInt[0] - inInt[1];
//			break;
//		case "*" :
//			result = inInt[0] * inInt[1];
//			break;
//		case "/" :
//			result = inInt[0] / inInt[1];
//			break;
//		default:
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			System.exit(0);
//		}
//		System.out.println("������: "+result);
//		return result;
//	}
}
