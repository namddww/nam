package java_gicho_09;

public class C20210402_06 {
	public static void main(String[] args) {
		int i;
		for(i=0;i<=4;i++) {  // 0, 1, 2, 3, 4
			for(int j=0;j<i; j++) {
				System.out.print("  "); // ��ĭ ��� : ĭ ���°� �Ѱ� ���̳��� �Ƕ�̵�
			}
				for(int k=0;k<5-i; k++) {
					System.out.print("* "); // ��ĭ ���
			}
			System.out.println();		
		}
	}
}







// �������� for �� ���!