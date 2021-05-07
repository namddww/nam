package java_gicho_09;
import java.util.Scanner;
public class Prac03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4-i; j++) {
				System.out.print("  ");
			}
			for (int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}