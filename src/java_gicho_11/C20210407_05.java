package java_gicho_11;
import java.util.Scanner;
public class C20210407_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�л����� �˷��ּ���");
		int b = scan.nextInt();
		int[][] k = new int[b][];
		
			for(int i=0;i<b;i++) {
				System.out.printf("%d��° �л��� ������� �˷��ּ���", i+1);
				int a = scan.nextInt();
				k[i] = new int[a];
				for(int j=0;j<a;j++) {
					System.out.printf("%d��° ������ ������ �˷��ּ���", j+1);
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
