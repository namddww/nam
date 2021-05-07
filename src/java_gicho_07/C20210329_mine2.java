// 집가서(나중에) 해보기!!

package java_gicho_07;
import java.util.Scanner;
public class C20210329_mine2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i = a/10; // 10의자리
		int j = a%10; // 1의 자리
		char num10 = ' ';
		char num1 = ' ';
		char c;
	
		if (j < 5 && i!=10) {
			num1 = '0';
//			System.out.println(num1);
		} else if(j >= 5 || i==10) {
			num1 = '+';
//			System.out.println(num1);
		}		
		
		if (i >= 9 && i <= 10) {
			c = 'A';
		} else if (i == 8) {
			c = 'B';
		} else if (i == 7) {
			c = 'C';
		} else if (i == 6) {
			c = 'D';
		} else if (i <= 5 && j >= 0) {
			c = 'F';
		} else {
			c = 'F';
			System.out.println("장난이 안통합니다.");
		}

		switch(c) {
		case 'A' :
			System.out.printf("%c%c", c, num1);
			break;
		case 'B' :
			System.out.printf("%c%c", c, num1);
			break;
		case 'C' :
			System.out.printf("%c%c", c, num1);
			break;
		case 'D' :
			System.out.printf("%c%c", c, num1);
			break;
		case 'F' :
			System.out.println(c); // 이게 더 관리하기 좋을것 같은 느낌이 듦..
			break;
		default : // 에러로! = else이니까
//			System.out.printf("F");
		}
		
		
				
//		switch(i) {
//		 case 10 :
//			 System.out.println("A"+num1);
//			 break;
//		 case 9 :
//			 System.out.println("A"+num1);
//			 break;
//		 case 8 :
//			 System.out.println("B"+num1);
//			 break;
//		 case 7 :
//			 System.out.println("C"+num1);
//			 break;
//		 case 6 :
//			 System.out.println("D"+num1);
//			 break;
//		 case 5 :
//			 System.out.println("F"+num1);
//		 case 4 :
//			 System.out.println("F"+num1);
//			 break;
//		 case 3 :
//			 System.out.println("F"+num1);
//			 break;
//		 case 2 :
//			 System.out.println("F"+num1);
//			 break;
//		 case 1 :
//			 System.out.println("F"+num1);
//			 break;
//		}
		

	}
}
	
	
	
