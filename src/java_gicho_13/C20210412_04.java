package java_gicho_13;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
public class C20210412_04 {
		public static void main(String[] args) throws Exception{ // 안넣어주면 에러
			try {
				FileReader f = new FileReader("C:\\Users\\namdd\\data2.txt");
				BufferedReader b = new BufferedReader(f); 	// 행단위로 데이터를 한방에 쭉 읽어온다
				String str = null;
				while((str=b.readLine())!=null) { 					// 한 줄단위로 읽어주는 애
					System.out.println(str);
				}
				b.close();
				f.close();
			} catch(Exception e) {
				System.out.println("\n에러");
			} finally {
				System.out.println("\n종료");
			}
			
		}
			
//		static void inp() {
//			FileInputStream file = new FileInputStream("C:\\Users\\namdd\\data2.txt"); 
//			int ch;								// utf-8 말고 ANSI로 바꿔야 실행됨: ANSI(8byte(7byte)만 사용)
//			
//			char[] a = new char[30];
//			int cnt = 0;
//			while ((ch = file.read()) != -1) {  	// file.read() 하나하나씩 읽어오는데 -1(아무것도 읽을게 없을 때)
//				System.out.print((char) ch); 	// 비트열을 바이트 단위로 읽어버리면 int형이 된다!
//				a[cnt] = (char)ch;
//				cnt++;
//			}									// 강제 형변환을 해 줘서 바이트 단위의 데이터를 글자로 읽어버린다
//												// 4byte 단위 -> 2byte 단위로 다시 읽으면 글자?
//			System.out.println();
//			for(char i : a) {
//				System.out.print(i);
//			}
//			file.close();
//			
//		}	
}
