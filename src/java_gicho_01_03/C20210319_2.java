package java_gicho_01_03;

public class C20210319_2 {
	public static void main(String[] args) {
		int a = 10;
		System.out.print(a);
		System.out.print(a);
//		System.out.printf("%f", a); //exception 에러: 두 타입이 달라서, 변형하다가 에러났다
		System.out.printf("%d %d", a, a); // "앞 포멧스트링" <- 앞 a, "뒤 포멧스트링" <- 뒤 a 1:1 매칭!
		System.out.printf("\n%d", a);
		System.out.printf("\n%d \t %f", a, 10.0f); // \n:엔터 \t:탭 띄기
		System.out.printf("\n%d \t %.3f", a, 3.141592f); // %.3f:세번째자리까지 나타냄(4번째자리에서 반올림)
		System.out.println("끝"); // println은 뒷자리에 엔터를 넣어주는 것!
		System.out.print(a);
	}

}
