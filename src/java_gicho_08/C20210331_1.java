package java_gicho_08;
import java.util.Scanner;
public class C20210331_1 {
	public static void main(String[] args) {
		// 1 ~ 100������ ������ ���ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		for(int i=1; i<=100; i++) { // i�� for�� �ȿ��� ����Ǿ����Ƿ� ����Ǹ� �����
//			System.out.println(i); 	// ctn ���� for���� ����Ǵ��� �����־�
			sum += i; 				// sum = sum+i; 
			cnt++;					// cnt ������
			// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			// ������� ������ ���� : �ݺ� Ƚ��
		}
		System.out.printf("���� �ݺ� Ƚ��: %d \n", cnt);
		System.out.printf("���� ��: %d", sum);
		System.out.println();
	}
}
