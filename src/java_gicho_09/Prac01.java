package java_gicho_09;
import java.util.Scanner;
public class Prac01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0;i<5;i++) {
			for (int j=0;j<i+1;j++) { // 엔터보다 별이 하나 더 많아야 함!
				System.out.print("* ");
			}
			System.out.println();
	}
			
}
}