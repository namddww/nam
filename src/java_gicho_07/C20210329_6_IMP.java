package java_gicho_07;
import java.util.Scanner;

//������ �ڵ� ver.01

public class C20210329_6_IMP {
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
					case 9 :
						a = 'A';
						if (5<=o || d == 10) {
							b = '+';
						}else {
							b = '0';
						}
						break;
					case 8 :
						a = 'B';
						if (5<=o) {
							b = '+';
						}else {
							b = '0';
						}
						break;
					case 7 :
						a = 'C';
						if (5<=o) {
							b = '+';
						}else {
							b = '0';
						}
						break;
					case 6 :
						a = 'D';
						if (5<=o) {
							b = '+';
						}else {
							b = '0';
						}
						break;
					default:
						a = 'F';
						b = ' ';
						
				}
				System.out.printf("����� ������ %c%c�Դϴ�.",a, b);
			}else {
				System.out.printf("�峭�� �����մϴ�.");
			}
		}
	}

	
