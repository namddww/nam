package java_gicho_10;

import java.util.Scanner;

public class C20210405_03_lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];  // 6���ۿ� �����Ƿ� �޸� ȿ���� �� ����
		
		// ���� ���� ���� 10�� ���´ٸ�?? ���ۼӵ��� ���Һ�.. teacher�� �����ϰ� ����
		
		int idx = 0;
		while (true) {
			int number = (int)(Math.random()*45)+1;				
			
			boolean insert = true;
			for (int i=0; i<=idx; i++) { // --> �ߺ� ����
				if(lotto[i] == number) {
						insert = false;
						break;  // for���� �ߴܽ�Ų��
						}
					}
				if (insert == true) {
					lotto[idx] = number;
					idx++;
				}
				if (idx == 6) // ������ ��� {} ������ �����ϴ� 
					break;	 // --> while�� �ߴ� 		
				}
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}

