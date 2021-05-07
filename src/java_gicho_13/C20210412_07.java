package java_gicho_13;
import java.io.FileOutputStream;
public class C20210412_07 {
		public static void main(String[] args) throws Exception{ // 안넣어주면 에러
			FileOutputStream f = new FileOutputStream("C:\\Users\\namdd\\data1.txt");
			int ch;
			while((ch = System.in.read()) != 13) {		// ASCII = 13 10 --> 엔터
				f.write((byte)ch);										// 엔터가 입력될 때가지 키보드에서 문자 하나를 읽어온다.
														// 65=a 일 때, 32byte 의 int는 뒷부분이 짤리고 나머지가 살아난다(char)강제형 변환시
			}
			f.close();
	}	
}