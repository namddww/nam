package java_gicho_07;
import java.util.Scanner;

//������ �ڵ� ver.01

public class C20210329_7_IMP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �˷��ּ���");
		int jum = scan.nextInt();
		if (0<=jum && jum<=100) {
			int d = jum/10;
			int o = jum%10;
			char a = ' ';
			char b = ' ';
			switch (d) {
				case 10 :
					a = 'A';
					b = '+';
					break;
				case 9 :
					a = 'A';
					break;
				case 8 :
					a = 'B';
					break;
				case 7 :
					a = 'C';
					break;
				case 6 :
					a = 'D';
					break;
				default:
					a = 'F';
					b = ' ';
			}

			if (6<=d && d<=9) {
				int p = o/5;
				
				switch (p) {
					case 0 :
						b = '0';
						break;
					case 1 :
						b = '+';
						break;
				}
			}
			
			System.out.printf("����� ������ %c%c�Դϴ�.",a, b);
		}else {
			System.out.printf("�峭�� �����մϴ�.");
		}
	}
}

	
