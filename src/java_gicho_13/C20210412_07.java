package java_gicho_13;
import java.io.FileOutputStream;
public class C20210412_07 {
		public static void main(String[] args) throws Exception{ // �ȳ־��ָ� ����
			FileOutputStream f = new FileOutputStream("C:\\Users\\namdd\\data1.txt");
			int ch;
			while((ch = System.in.read()) != 13) {		// ASCII = 13 10 --> ����
				f.write((byte)ch);										// ���Ͱ� �Էµ� ������ Ű���忡�� ���� �ϳ��� �о�´�.
														// 65=a �� ��, 32byte �� int�� �޺κ��� ©���� �������� ��Ƴ���(char)������ ��ȯ��
			}
			f.close();
	}	
}