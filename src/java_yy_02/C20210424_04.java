package java_yy_02;

public class C20210424_04 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		BB2 b = new BB2();
		System.out.println(b.add(a));
		CC2 c = new CC2();
		System.out.println(c.add(1,2,3,4,5,6,7)); // 1ȸ�� �Է�: ���� �Ұ�..
	}
	
}
class BB2{
	int add(int[] a) { // �����ڰ� �迭�� ���� ������.
		int result =0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

class CC2{
	int add(int ... a) { // �����ڰ� ���� ��Ҹ� �ڵ����� �迭�� �����.
		int result =0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

class BBB{
	int add(int a, int b) {
		return a+b; // ��ȯ
//		System.out.println(a+b); //���޺Ұ��� : ���� : ����� ���ɼ��� ����
	}
}