package java_gicho_08;

import java.util.Scanner;

public class C20210331_4 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		// 실수 : double타입니다.
		// 0.7451107450072757
		// 완전한 렌덤은 없다! 컴퓨터도 seed값을 제공해 줘야 하는데(c언어), 파이썬이나 자바는 자동으로 seed값이 생성된다.
		// seed값은 보통 시간타이머를 기준으로 한다고 함.
		// 소수부를 삭제... : 강제형변환 int
		System.out.println((int)(Math.random()*10) + " (10가지의 경우의 수:0~9)"); //0~9
		System.out.println((int)(Math.random()*100) + "% (100가지의 경우의 수:0~99)"); //0~99
		System.out.println((int)(Math.random()*10) + 1 + "\t(10가지의 경우의 수:1~10)"); //1~10
		System.out.println((int)(Math.random()*100)+ 1 + "%\t(100가지의 경우의 수:1~100)"); //1~100
	}
}
