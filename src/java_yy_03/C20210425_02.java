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
//		A = "LG"; // 이건 사용 불가. 왜? final이며, 초기화 기회를 이미 한번 사용했음..
		System.out.println();
		C = A + "-" + B;
		a = "LG";
		
	}
}
