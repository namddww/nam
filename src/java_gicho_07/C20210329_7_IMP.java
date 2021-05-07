package java_gicho_07;
import java.util.Scanner;

//선생님 코드 ver.01

public class C20210329_7_IMP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 알려주세요");
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
			
			System.out.printf("당신의 학점은 %c%c입니다.",a, b);
		}else {
			System.out.printf("장난이 안통합니다.");
		}
	}
}

	
