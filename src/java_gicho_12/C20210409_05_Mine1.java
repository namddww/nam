package java_gicho_12;
import java.util.Scanner;
public class C20210409_05_Mine1 {
	public static void main(String[] args) {
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		int[] inin = new int[2];
		inin = inpt(inin);
		System.out.println(cal(inin, ""));
		
		
		
	}
	
	// �Է� �ޱ�
	static int inp() {
		int a=0;
		System.out.println("���� �Է�:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}
	
	// �迭 ����� �� �ֱ�
	static int[] inpt(int[] in) {
		for (int i=0;i<2;i++) {
			in[i] = inp();
		}
		return in;
	}
	
	// ���� �޾� ���
	static int cal(int[] in, String str) {
		int result = 0;
		System.out.println("��ȣ �Է�:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		switch(str) {
		case "+" :
			result = in[0] + in[1];
			break;
		case "-" :
			result = in[0] - in[1];
			break;
		case "*" :
			result = in[0] * in[1];
			break;
		case "/" :
			result = in[0] * in[1];
			break;
		default :
				System.out.println("�߸� �Է�");
				System.exit(0);
		}
		return result;
	}
	
}
