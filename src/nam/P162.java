package nam;

public class P162 {
	public static void main(String[] args) {
		Operator op = new Operator();
		System.out.println(op.multiply(4,3));
	}
}

class Operator {
	int multiply(int x, int y) {
		return x * y;
	}

	long multiply(long x, long y) {
		return x * y;
	}
	
	long multiply(int x, long y) {
		return x * y;
	}

//	4.3 3.0f �� ��ȯ�ϰ� �ʹ�
	double multiply(double x, float y) {
		return x * y;
	}
}