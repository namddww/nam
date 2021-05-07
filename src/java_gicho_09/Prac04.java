package java_gicho_09;
import java.util.Scanner;
public class Prac04 {
	public static void main(String[] args) {
		boolean run = true;
		
		int sum = 0;
		int i = 0;
		
		while(run) {
			i++;
			sum += i;
			if (i>100) {
				run=false;
			}
// 여기는 과정이 보인다
		}
		System.out.println(sum);
// 여기는 결과값만 보인다
 	}
}