package java_gicho_01_03;

public class C20210319_2 {
	public static void main(String[] args) {
		int a = 10;
		System.out.print(a);
		System.out.print(a);
//		System.out.printf("%f", a); //exception ����: �� Ÿ���� �޶�, �����ϴٰ� ��������
		System.out.printf("%d %d", a, a); // "�� ���佺Ʈ��" <- �� a, "�� ���佺Ʈ��" <- �� a 1:1 ��Ī!
		System.out.printf("\n%d", a);
		System.out.printf("\n%d \t %f", a, 10.0f); // \n:���� \t:�� ���
		System.out.printf("\n%d \t %.3f", a, 3.141592f); // %.3f:����°�ڸ����� ��Ÿ��(4��°�ڸ����� �ݿø�)
		System.out.println("��"); // println�� ���ڸ��� ���͸� �־��ִ� ��!
		System.out.print(a);
	}

}
