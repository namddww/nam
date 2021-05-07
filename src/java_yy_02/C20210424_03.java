package java_yy_02;

public class C20210424_03 {
	public static void main(String[] args) {
		int[] a = new int[5];
		BBC b = new BBC();
		System.out.println(b.add(a));
		
	}
}

class BBC {
	int add(int[] a) {
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	} 
}

class CCC {
	int add(int ... a) { // 개발자가ㄱ
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	} 
}
