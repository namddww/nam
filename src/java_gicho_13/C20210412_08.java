package java_gicho_13;
import java.io.FileWriter;
import java.util.Scanner;

// ���ڿ��� �޾Ƽ� ���پ� ���Ͽ� ����
public class C20210412_08 {
		public static void main(String[] args) throws Exception{ // �ȳ־��ָ� ����
			Scanner scan = new Scanner(System.in);
			FileWriter fw = new FileWriter("C:\\Users\\namdd\\data1.txt");

			String str;
			while(!(str = scan.nextLine()).equals("")) {
				fw.write(str + "\r\n");
			}		
			
			scan.close();
			fw.close();
	}
}
// System.in <= �츮�� �Է��� ���� �ƽ�Ű �ڵ�� �޴´�(10������)