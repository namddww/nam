package java_gicho_13;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
public class C20210412_04 {
		public static void main(String[] args) throws Exception{ // �ȳ־��ָ� ����
			try {
				FileReader f = new FileReader("C:\\Users\\namdd\\data2.txt");
				BufferedReader b = new BufferedReader(f); 	// ������� �����͸� �ѹ濡 �� �о�´�
				String str = null;
				while((str=b.readLine())!=null) { 					// �� �ٴ����� �о��ִ� ��
					System.out.println(str);
				}
				b.close();
				f.close();
			} catch(Exception e) {
				System.out.println("\n����");
			} finally {
				System.out.println("\n����");
			}
			
		}
			
//		static void inp() {
//			FileInputStream file = new FileInputStream("C:\\Users\\namdd\\data2.txt"); 
//			int ch;								// utf-8 ���� ANSI�� �ٲ�� �����: ANSI(8byte(7byte)�� ���)
//			
//			char[] a = new char[30];
//			int cnt = 0;
//			while ((ch = file.read()) != -1) {  	// file.read() �ϳ��ϳ��� �о���µ� -1(�ƹ��͵� ������ ���� ��)
//				System.out.print((char) ch); 	// ��Ʈ���� ����Ʈ ������ �о������ int���� �ȴ�!
//				a[cnt] = (char)ch;
//				cnt++;
//			}									// ���� ����ȯ�� �� �༭ ����Ʈ ������ �����͸� ���ڷ� �о������
//												// 4byte ���� -> 2byte ������ �ٽ� ������ ����?
//			System.out.println();
//			for(char i : a) {
//				System.out.print(i);
//			}
//			file.close();
//			
//		}	
}
