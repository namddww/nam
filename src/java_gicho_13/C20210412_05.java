package java_gicho_13;
import java.io.FileInputStream;
public class C20210412_05 {
		public static void main(String[] args) throws Exception{ // �ȳ־��ָ� ����
			FileInputStream file = new FileInputStream("C:\\Users\\namdd\\data2.txt"); 
			int ch;								// utf-8 ���� ANSI�� �ٲ�� �����: ANSI(8byte(7byte)�� ���)
			
			char[] a = new char[30];
			int cnt = 0;
			while ((ch = file.read()) != -1) {  	// file.read() �ϳ��ϳ��� �о���µ� -1(�ƹ��͵� ������ ���� ��)
				System.out.print((char) ch); 	// ��Ʈ���� ����Ʈ ������ �о������ int���� �ȴ�!
				a[cnt] = (char)ch;
				cnt++;
			}									// ���� ����ȯ�� �� �༭ ����Ʈ ������ �����͸� ���ڷ� �о������
												// 4byte ���� -> 2byte ������ �ٽ� ������ ����?
			System.out.println();
			for(char i : a) {
				System.out.print(i);
			}
			file.close();
			
	}
	
}
