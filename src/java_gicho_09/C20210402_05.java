package java_gicho_09;

public class C20210402_05 {
	public static void main(String[] args) {
		int i;
		for (i=0; i<5; i++) { // ������ Ƚ��
			for (int j=0; j<5-i; j++) { // ���� ���� = 5-1 �ߴٰ� ����
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}