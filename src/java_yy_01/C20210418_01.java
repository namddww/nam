package java_yy_01;

public class C20210418_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

// 구체화 클래스(main 꼭 필요) vs 참조형 클래스(main 없어도 됨)

// 규칙 하나의 파일에는 여러개의 class가 담길 수 있다.
// 여러개의 class중 반드시 한개의 class만 public 접근제한자를 가질 수 있다. --> 아마 무한 퍼블릭 생성을 막고 경로를 한쪽으로 통일하기 위해서?
// public 키워드를 붙일 수 있는 class --> 일명과 같아야 한다.(대표클래스)
// 반드시 public 키워드를 갖고 있는 class에 main 메서드를 만들어야 한다.
// [자바로더]java C20210418 -> 외부 프로그램이 찾아들어오려면 public이 필요! (로더가 접근하는 이유? main을 실행하기 위해서!)
// 클래스가 여러개 있을 경우, 컴퓨터에게 명시해 줘야 한다! 그래야 컴퓨터가 실행할 수 있다.
// 같은 파일에 존재하는 class 라도 compile 하면 별개의 클래스 파일을 생성한다!			compile: 엮다

class K_sub{ // default 같은 클래스 + 같은 패키지
	K_sub() {}	// 기본 생성자 ---> 모든 class는 반드시 1개 "이상의" 생성자를 가져야 한다.
				// 그래서 생성자를 만들어주지 않으면 컴파일러에 의해 기본생성자가 만들어진다.
				// {}가 있으므로 함수 호출이 아닌, 함수 비슷한 생성자를 "생성"한다!!
}