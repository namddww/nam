package java_gicho_06;
import java.util.Scanner;
public class C20210326_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ����:");
		int score = scan.nextInt();
		char q = ' '; // �������
		char w = '0'; //  + 0
		int a = score/10;
		int b = score%10;
		System.out.println(a);
		System.out.println(b);
		if (9 == a || a ==10) { // ���ǽ�1
			q = 'A';             // ���ǽ�1�� true�� ���
		}else{                  // ���ǽ�1�� false�� ���
            if (8 == a) {       // ���ǽ�2
        	q = 'B';            // ���ǽ�1�� false�̸鼭 ���ǽ�2�� true�� ���
            }else{              // ���ǽ�1�� false�̸鼭 ���ǽ�2�� false�� ���
                if (7 == a) {   // ���ǽ�3
                    q = 'C';    // ���ǽ�1�� false�̸鼭 ���ǽ�2�� false�̸鼭 ���ǽ�3�� true�� ���
                }else{          // ���ǽ�1�� false�̸鼭 ���ǽ�2�� false�̸鼭 ���ǽ�3�� false�� ���
                    if (6 == a) { // ���ǽ� 4
                        q = 'D';
                    }else {
                    	if (0 <= a && a <=5) {
                        	q = 'F';
                        	w = ' ';
                		}else {
                			System.out.println("�׷���������.");
                		}
                    }
                }
            }
        }
        
        if (b>=5 && a>=6 || a == 10) {
			w ='+';
		}
        
        System.out.printf("����� ����:%c%c", q, w);
		// ���� ó�� ���α׷�
		/*
		 * 0 ~ 100�������� ������ �Է¹޾� 90 ~ 100 : A
		 *                           80 ~  89 : B
		 *                           70 ~  79 : C
		 *                           60 ~  69 : D
		 *                            0 ~  59 : F 
		 */
	}
}

