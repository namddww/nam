package java_gicho_01_03;
import java.util.Scanner;
public class C20210319_3 {
	public static void main(String[] args) {
		System.out.print("이름을 알려주세요:");
		Scanner scan = new Scanner(System.in);
	//	Scanner 클래스   생성자        시스템으로 입력(표준입력장치의 입력값을 받는다 = 키보드의 입력값을 받는다.) 컴퓨터 표준 출력장치: 모니터
	//	Scanner 클래스로 객체를 만들고 그 안에 키보드 입력값을 저장해라 그리고 그객체의 주소를 scan 변수에 저장
		Scanner scan2 = new Scanner(System.in);
		
		String name = scan.nextLine(); //nextLine() 방금전 만든 입력값을 문자열로 읽어봐라!
	//				  변수 scan을 따라가서 객체안에 있는 문자열을 읽어봐라
		System.out.printf("나의 이름은: %s입니다.\n", name);
		System.out.println("냐이를 알려주세요: ");
		String s1 = scan.nextLine();
		int age = Integer.parseInt(s1);
		System.out.printf("나의 나이는: %d입니다.", age);
	}

}