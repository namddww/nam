package java_gicho_11;
import java.util.Scanner;
public class C20210407_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] b = {"ȫ�浿", "�达", "����"};
		int[][] c = {{90, 80, 70}, {90, 60, 70}, {90, 60, 70, 100}, {68, 80, 45}};
		System.out.printf("���л��� ���� %d�Դϴ�. \n", b.length);
		System.out.printf("������ �˰���� �л��� ��ȣ�� �Է�");
		int num = scan.nextInt();
		int num1 = num - 1;
		int sum = 0;
		for(int j=0;j<c[num1].length;j++) {
			System.out.println(b[num1]+" : "+c[num1][j]);
			sum += c[num1][j];
		}
		
		System.out.printf("%s�� ������ : %d\n", b[num1], sum);
		System.out.printf("%s�� ������ : %1f", b[num1], ((float)sum/c[num1].length));
		
		
	}
}
