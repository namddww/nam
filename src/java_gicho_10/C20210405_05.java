package java_gicho_10;

import java.util.Scanner;

public class C20210405_05 {
	public static void main(String[] args) {
		
		//System.out.println("1:" + args[0]);
		//System.out.println("2:" + args[1]);
		
		int sum=0;
		for(int i=0;i<args.length;i++) {
			int num = Integer.parseInt(args[i]);
			sum = sum + num;
		}
		System.out.println("sum:" +sum);	
	}
}


// cmd에서 실행해보기 javac 로 컴파일 후 java 로 실행!