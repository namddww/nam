package java_gicho_13;
import java.io.File;
import java.util.Scanner;
public class C20210412_06 {
		public static void main(String[] args) throws Exception{ // �ȳ־��ָ� ����
			Scanner scan = new Scanner(new File("C:\\Users\\namdd\\num.txt"));
			int sum = 0;
			int cnt = 0;
			
			while(scan.hasNextLine()) {	// hasNextLine() ������ ���������� ���� �ݺ�
				sum += scan.nextInt();	// �������� ������ true / ������ false
				cnt++;
		}
		System.out.println("�հ�: "+sum);
		System.out.println("�հ�: "+sum/cnt);
		scan.close();
		}
}
