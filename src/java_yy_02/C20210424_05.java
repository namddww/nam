package java_yy_02;

public class C20210424_05 {
	public static void main(String[] args) {
		BB3 b = new BB3(); // class BB�� �⺻ �����ڸ� ȣ���ߴ�.
		CC3 c = new CC3(3.7f);
		System.out.println(c.x);

	}

}
class BB3 {
	
}
class CC3 {
	int x = 10;
	CC3(){}
	CC3(int a){
		x = a; // �ʱ�ȭ ��
	}
	CC3(float a){
		x = (int)a; // �ʱ�ȭ ��
	}
}