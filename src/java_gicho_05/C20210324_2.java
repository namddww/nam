package java_gicho_05;
import java.util.Scanner;
public class C20210324_2 {
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		//���������� ���� ū ���� �ҷ��Ͷ�.
		System.out.printf("������ ���� : %d ~ %d", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("11111111111111111111111111111100", 2)) ;
		//32�� �ƴ� 31�ڸ����� �Է��ؾ�.. ��?! 1 �ڸ��� ��ȣ��Ʈ��?!?
		// 2������ ���ϱ�
		System.out.println(2147483644-Integer.MAX_VALUE-1) ;
	}

}

//public class C20210324_2 {
//	public static void main(String[] args) {
//		
//		System.out.println(Integer.MAX_VALUE);
//		// ������������ ���� ū ���� �ҷ��Ͷ�.
//		System.out.printf("������ ���� : %d ~ %d\n",Integer.MIN_VALUE, Integer.MAX_VALUE);
//		System.out.println(Integer.parseInt("1111111111111111111111111111100",2));
//		System.out.println(2147483644-Integer.MAX_VALUE-1);
//	}
//}
