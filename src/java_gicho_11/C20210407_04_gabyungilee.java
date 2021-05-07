package java_gicho_11;
import java.util.Scanner;
public class C20210407_04_gabyungilee {
	public static void main(String[] args) {
		int[][] k = new int[2][2];
		k[0] = new int[] {1,2,3};
		k[1] = new int[] {4,5,6,7,8};
		int kk = k[1].length;
		for(int i=0;i<k[1][k[1].length-1];i++) { //생성된 배열 안에 배열을 집어넣었다
			System.out.println(k[1][i]);
		}
		
	}
}
