package java_gicho_07;
import java.util.Scanner;
public class C20210329_mine1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i = 0;
		
		if (a <= 59) {
			i = 9;
		} else if (a <= 64) {
			i = 8;
		} else if (a <= 69) {
			i = 7;
		} else if (a <= 74) {
			i = 6;
		} else if (a <= 79) {
			i = 5;
		} else if (a <= 84) {
			i = 4;
		} else if (a <= 89) {
			i = 3;
		} else if (a <= 94) {
			i = 2;
		} else if (a <= 100) {
			i = 1;
		} else {
			i = 0;
		}
		
		
		switch(i) {
		case 1 : 
			System.out.println("A+");	
			break;
		case 2 : 
			System.out.println("A0");
			break;
		case 3 : 
			System.out.println("B+");
			break;
		case 4 : 
			System.out.println("B0");
			break;
		case 5 : 
			System.out.println("C+");
			break;
		case 6 : 
			System.out.println("C0");
			break;
		case 7 : 
			System.out.println("D+");
			break;
		case 8 : 
			System.out.println("D0");
			break;
		case 9 : 
			System.out.println("F");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
//		System.out.println(i);
	}
}
	
	
	
