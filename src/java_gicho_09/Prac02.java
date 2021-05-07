package java_gicho_09;
import java.util.Scanner;
public class Prac02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5-i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for (int i=0;i<5;i++) {
			for (int j=5;j>i;j--) {
				System.out.print("* ");
		}
		System.out.println();
		}
	}
}