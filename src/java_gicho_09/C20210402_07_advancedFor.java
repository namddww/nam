package java_gicho_09;

public class C20210402_07_advancedFor {
	public static void main(String[] args) {
		int[] a = {1,2,9,4,5};
		//		   0 1 2 3 4
		for (int i : a) { // �ݺ� Ƚ�� : �迭 ����� ����
			System.out.println(i); // ���� for��(���α׷� ����)
			System.out.println(a);
		}
		System.out.println();
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]); // ������ for��(�迭 ���ۿ� ����)
		}
		
	}
}






