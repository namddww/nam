package java_yy_03;

public class C20210425_03 {
	public static void main(String[] args) {
			CC c = new CC();
			System.out.println(c.c); //���� ����
			System.out.println(c.get()); //���� ����
			//c.com = "����"; ����
			c.set("����");
			//BB a = new BB(); // ������ ȣ�� ���� : private
			BB d = BB.get();
			System.out.println(d.geta()); // 10
			d.seta(20);
			System.out.println(d.geta()); // 20
			
			BB e = BB.get();
			System.out.println(e.geta());// ���� �����Ǿ��ٸ� 10�� ���
			                             // ���� ��ü�� �ּҰ� ��ȯ�Ǿ��ٸ� 20�� ���
		}

	}
	class BB{
		private int a = 10;
		private static final BB single = new BB();
		
		private BB() {}
		
		//getter ---> ��ü�� �����ϴ� ������ �ܺο� �����Ų��.
		// ���� ������ ���� �����ϴ� ���� ����
		// ��û�� ������ ���� �ܺη� ������ ������ ������ �� �ִ�.
		static BB get() {
			return single;
		}
		int geta() {
			return this.a;
		}
		void seta(int num) {
			this.a = num;
		}
	}

	class CC{
		String c = "blue";
		private String com = "���";
		
		String get() { //���� ������ �����ڰ� ����� ������ �����ش�.
			return this.com; // getter
		}
		void set(String a) { // setter
			this.com = a;
	}
}

