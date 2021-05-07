package java_gicho_11;
import java.util.Scanner;
public class C20210407_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] b = {"홍길동", "김씨", "나씨"};
		int[][] c = {{90, 80, 70}, {90, 60, 70}, {90, 60, 70, 100}, {68, 80, 45}};
		System.out.printf("총학생의 수는 %d입니다. \n", b.length);
		System.out.printf("성적을 알고싶은 학생의 번호를 입력");
		int num = scan.nextInt();
		int num1 = num - 1;
		int sum = 0;
		for(int j=0;j<c[num1].length;j++) {
			System.out.println(b[num1]+" : "+c[num1][j]);
			sum += c[num1][j];
		}
		
		System.out.printf("%s의 총점은 : %d\n", b[num1], sum);
		System.out.printf("%s의 총점은 : %1f", b[num1], ((float)sum/c[num1].length));
		
		
	}
}
