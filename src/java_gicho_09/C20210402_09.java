package java_gicho_09;

public class C20210402_09 {
	public static void main(String[] args) {
		boolean flag = true; // 불리언으로 시작하면, 90%는 while문이다!
		
//		while(flag) = 영원히 돌아간다..
		int sum = 0;
		int i = 0;
		while(flag) {  // 일단 while문이니까 무한으로 돌리고 if로 나와라
			i++;
			sum+=i;
			if (i>=10) {
				flag = false;
			}
		}
		System.out.println(sum);
	}
}

