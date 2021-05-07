package java_gicho_10;

import java.util.Scanner;

public class C20210405_03_lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];  // 6개밖에 없으므로 메모리 효율이 더 좋다
		
		// 만약 같은 수가 10번 나온다면?? 동작속도가 복불복.. teacher은 동일하게 느림
		
		int idx = 0;
		while (true) {
			int number = (int)(Math.random()*45)+1;				
			
			boolean insert = true;
			for (int i=0; i<=idx; i++) { // --> 중복 제거
				if(lotto[i] == number) {
						insert = false;
						break;  // for문을 중단시킨다
						}
					}
				if (insert == true) {
					lotto[idx] = number;
					idx++;
				}
				if (idx == 6) // 한줄인 경우 {} 생략은 가능하다 
					break;	 // --> while문 중단 		
				}
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}

