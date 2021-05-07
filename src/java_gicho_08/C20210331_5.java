package java_gicho_08;

import java.util.Scanner;

// 로또 게임
public class C20210331_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("로또번호의 갯수를 알려주세요.");
		int cnt = scan.nextInt();
		for (int i =0; i<cnt; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
	}

}
