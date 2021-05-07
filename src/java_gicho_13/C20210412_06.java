package java_gicho_13;
import java.io.File;
import java.util.Scanner;
public class C20210412_06 {
		public static void main(String[] args) throws Exception{ // 안넣어주면 에러
			Scanner scan = new Scanner(new File("C:\\Users\\namdd\\num.txt"));
			int sum = 0;
			int cnt = 0;
			
			while(scan.hasNextLine()) {	// hasNextLine() 파일의 마지막까지 무한 반복
				sum += scan.nextInt();	// 다음줄이 있으면 true / 없으면 false
				cnt++;
		}
		System.out.println("합계: "+sum);
		System.out.println("합계: "+sum/cnt);
		scan.close();
		}
}
