package java_gicho_12;

public class C20210409_02 {
	public static void main(String[] args) {
		// �Լ� ----> ��� function
		// ������ �ʱ�ȭ
		int[]a = {0, 1, 0, 1, 2, 3, 4, 1, 2, 3, 4};
		String phone1 = "";
		String phone2 = "";
		String phone3 = "";
		// ��ȭ��ȣ�ν� ��� ������ �������ΰ�? Ȯ��
		if (a.length == 11) {
			System.out.println("��ȭ��ȣ ���� ����");
		}
		// ��ȭ��ȣ�� 1��° ��
		phone1 = aa(a, 0, 3);
		for(int i=0; i<3; i++) {
//			System.out.println(phone);
			phone1 = phone1 + String.valueOf(a[i]); // ���� ������ ---> ���ڿ� ������ ��ȯ
		}
		// ��ȭ��ȣ�� 2��° ��
		phone2 = aa(a, 3, 7);
		for(int i=3; i<7; i++) {
//			System.out.println(phone);
			phone2 = phone2 + String.valueOf(a[i]); // ���� ������ ---> ���ڿ� ������ ��ȯ
		}
		// ��ȭ��ȣ�� 3��° ��
		phone3 = aa(a, 7, 11);
		for(int i=7; i<11; i++) {
//			System.out.println(phone);
			phone3 = phone3 + String.valueOf(a[i]); // ���� ������ ---> ���ڿ� ������ ��ȯ
		}
		// ���� ���
		System.out.print(phone1 + "-" + phone2 + "-" + phone3);
	}
	// �Լ� �ۼ� ---> ��� : �����͸� �޾Ƽ� ���ڿ��� �����ִ� ��� �ʿ�
	// �ݺ��ؼ� ����Ѵ�.
	static String aa(int[] a, int b, int c) { // a, b, c �ּ� ����! �� ���� �ƴ�!
		String phone = "";
		for(int i=b; i<c; i++) {
			phone = phone + String.valueOf(a[i]); // ���� ������ ---> ���ڿ� ������ ��ȯ
		}
		return phone;
	}
}
