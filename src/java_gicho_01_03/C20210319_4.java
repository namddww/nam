package java_gicho_01_03;
import java.util.Scanner;
public class C20210319_4 {
	public static void main(String[] args) {
		String a = "kong";
		String b = null;
		String c = "kong";
		String cc = "kong "; //공백을 추가하면 index 계열이 5개가 돼서.. 새로 만듦
		String d = new String("kong"); //명시적으로 새로만들어! : 그냥 새로만들어
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		System.out.println(a.equals(c)); //a와 c의 값을 비교하라! true? 같은 주소를 사용한다!
		System.out.println(a.equals(cc)); //a와 c의 값을 비교하라! false? 같은 주소를 사용한다
	
		if (c == d) { // ==는 주소를 비교한다.
			System.out.println("둘의 주소는 같아.");
		} else {
			System.out.println("둘의 주소는 다르다.");
		} System.out.println(d.equals(c)); // 값을 비교: true = 같다!
		
	}

}
