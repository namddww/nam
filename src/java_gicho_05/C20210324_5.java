package java_gicho_05;

public class C20210324_5 {
	public static void main(String[] args) {
		int ageInt = 30;
		String c = ageInt + "";
//		String c = toString(ageInt); // toString()? ���?
		System.out.println(c);
		int d = Integer.parseInt(c);
		System.out.println(d);
		float e = Float.parseFloat(c);
		System.out.println(e);

		
		char a = '\u0001';
		//		 --			: UNI-CODE = �������̸� ���´�.
		//		    - 		: 16����
		//		 	4 * 4 	--> 16bit -->2Byte
		// UTF-8 ---> 1Byte	: �����ڵ� 1Byte ¥��
		// UTF-16 --> 2Byte	: �����ڵ� 1Byte ¥��
		// UTF-32 --> 4Byte	: �����ڵ� 1Byte ¥��
		System.out.println(a);
		
		int q = 1;
		static int qq = 1;
		
	}
}

