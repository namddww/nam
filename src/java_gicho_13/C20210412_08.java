package java_gicho_13;
import java.io.FileWriter;
import java.util.Scanner;

// 문자열을 받아서 한줄씩 파일에 쓰기
public class C20210412_08 {
		public static void main(String[] args) throws Exception{ // 안넣어주면 에러
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
// System.in <= 우리가 입력한 값을 아스키 코드로 받는다(10진수로)