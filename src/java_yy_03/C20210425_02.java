package java_yy_03;

public class C20210425_02 {
	public static void main(String[] args) {
		System.out.println(S_f.C);
	}
}

class S_f {
	static final String A = "samsung";
	static final String B = "display";
	static final String C;

	static String a = "samsung";
	static String b = "display";
	
	static {
//		A = "LG"; // �̰� ��� �Ұ�. ��? final�̸�, �ʱ�ȭ ��ȸ�� �̹� �ѹ� �������..
		System.out.println();
		C = A + "-" + B;
		a = "LG";
		
	}
}
