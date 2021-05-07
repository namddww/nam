package java_gicho_09;

public class C20210402_08__while__ {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=10) { // i<=10 충족되고 있느 동안에 반복한다.
			sum += i;
			i++;
		}
		int j;
		int sum2 = 0;
		for (j=0; j<10; j++) {
			sum2 += i;
			j++;
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
}
