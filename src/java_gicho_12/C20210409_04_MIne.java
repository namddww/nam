package java_gicho_12;
import java.util.Scanner;
public class C20210409_04_MIne {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		// ���� �Է¹ް� �迭�� ���� �� +-*/ ������ �ϴ� ���α׷��� ������
		int[] inin = new int[2];
		inin = arr(inin);
		String strIn = new String();
//		str(strIn, inin);
		System.out.println(str(strIn, inin));
		
	}	
	
	// �Է� �ޱ� (int)
	 static int inpt() { // �޼��� �ٷ� �����ϱ� ���ؼ��� static �׷��� ������ ��ü�� ���� �����...
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		a = scan.nextInt();
		return a;
	}
	 
	 // �迭 �����
	 static int[] arr(int[] in) {
		 for (int i = 0; i<2; i++) {
			 in[i] = inpt();
		 }
		 return in;
	 }
	 
	 // �Է� �ް� ��� (+-*/)
	 static int str(String str, int[] in) {
		 System.out.println("��ȣ�� �Է��ϼ���.");
		 Scanner scan = new Scanner(System.in);
		 str = scan.nextLine();
		 int result = 0;
		 switch (str) {
			 case "+" : 
				 result = in[0] + in[1];
				 System.out.println("[+ Ȱ��ȭ]");
				 break;
			 case "-" : 
				 result = in[0] - in[1];
				 System.out.println("[- Ȱ��ȭ]");
				 break;
			 case "*" : 
				 result = in[0] * in[1];
				 System.out.println("[* Ȱ��ȭ]");
				 break;
			 case "/" : 
				 result = in[0] / in[1];
				 System.out.println("[/ Ȱ��ȭ]");
				 break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				System.exit(0);
		 }
		 return result;
	 }
}
	 
