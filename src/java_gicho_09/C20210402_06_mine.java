package java_gicho_09;

public class C20210402_06_mine {
	public static void main(String[] args) {
		int i;
		for(i=0;i<=4;i++) {  // 0, 1, 2, 3, 4
			int j;
			for(j=4;j>i; j--) {
				System.out.print("  "); // ��ĭ ��� : ĭ ���°� �Ѱ� ���̳��� �Ƕ�̵�
			}
				for(int k=1;k<=j+1; k++) {
					System.out.print("* "); // ��ĭ ���
			}
			System.out.println();		
		}
	}
}