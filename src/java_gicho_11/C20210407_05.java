package java_gicho_11;
import java.util.Scanner;
public class C20210407_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수를 알려주세요");
		int b = scan.nextInt();
		int[][] k = new int[b][];
		
			for(int i=0;i<b;i++) {
				System.out.printf("%d번째 학생의 과목수를 알려주세요", i+1);
				int a = scan.nextInt();
				k[i] = new int[a];
				for(int j=0;j<a;j++) {
					System.out.printf("%d번째 과목의 점수를 알려주세요", j+1);
					k[i][j] = scan.nextInt();
				}
			}
			
			for(int j=0;j<k.length;j++) {
				for(int i=0;i<k[j].length;i++) {
					System.out.println(k[j][i]);
			}
			System.out.println();
		}
	}
}
