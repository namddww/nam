package java_gicho_08;

import java.util.Scanner;

public class C20210331_4 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		// �Ǽ� : doubleŸ�Դϴ�.
		// 0.7451107450072757
		// ������ ������ ����! ��ǻ�͵� seed���� ������ ��� �ϴµ�(c���), ���̽��̳� �ڹٴ� �ڵ����� seed���� �����ȴ�.
		// seed���� ���� �ð�Ÿ�̸Ӹ� �������� �Ѵٰ� ��.
		// �Ҽ��θ� ����... : ��������ȯ int
		System.out.println((int)(Math.random()*10) + " (10������ ����� ��:0~9)"); //0~9
		System.out.println((int)(Math.random()*100) + "% (100������ ����� ��:0~99)"); //0~99
		System.out.println((int)(Math.random()*10) + 1 + "\t(10������ ����� ��:1~10)"); //1~10
		System.out.println((int)(Math.random()*100)+ 1 + "%\t(100������ ����� ��:1~100)"); //1~100
	}
}
