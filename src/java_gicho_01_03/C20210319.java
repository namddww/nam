package java_gicho_01_03;

public class C20210319 {
	public static void main(String[] args) {
		float a = 123.123454789123456789f; 
		// ������ ������(������ ������) : float ����ϴ� ��� ������
		// 0.0000004 ��ŭ ���� �߻��� ��? ǥ�� ������ ����뼭.. over_flow �Ǳ� ����
		double b = 123.123456789123456789;
		// �ڹ��� �Ǽ� �⺻ Ÿ���� double
		// ���� �ڹ��� �Ǽ�: �⺻ double Ÿ��
		// �����÷ο� : ���� �� �ִ� ���� �ʰ���
		System.out.printf("%f", a);
		
		int c = 5;
		long d = 10;
		
		char bd = 'H';
		
	}
}
