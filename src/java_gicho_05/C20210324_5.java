package java_gicho_05;

public class C20210324_5 {
	public static void main(String[] args) {
		int ageInt = 30;
		String c = ageInt + "";
//		String c = toString(ageInt); // toString()? 어떻게?
		System.out.println(c);
		int d = Integer.parseInt(c);
		System.out.println(d);
		float e = Float.parseFloat(c);
		System.out.println(e);

		
		char a = '\u0001';
		//		 --			: UNI-CODE = 가변길이를 갖는다.
		//		    - 		: 16진수
		//		 	4 * 4 	--> 16bit -->2Byte
		// UTF-8 ---> 1Byte	: 유니코드 1Byte 짜리
		// UTF-16 --> 2Byte	: 유니코드 1Byte 짜리
		// UTF-32 --> 4Byte	: 유니코드 1Byte 짜리
		System.out.println(a);
		
		int q = 1;
		static int qq = 1;
		
	}
}

