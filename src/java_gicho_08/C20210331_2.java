package java_gicho_08;
import java.util.Scanner;
public class C20210331_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for(int i=0; i<=10; i++) { // i�� for�� �ȿ��� ����Ǿ����Ƿ� ����Ǹ� �����
			System.out.println(i); // ctn ���� for���� ����Ǵ��� �����־�
			cnt++;					// cnt ������
		}
		System.out.printf("���� �ݺ� Ƚ��: %d", cnt);

		for(int i=0; i<=10; i+=2) { 
			System.out.println(i); 
			cnt++;
		}
		System.out.printf("���� �ݺ� Ƚ��: %d", cnt);
	}
}
