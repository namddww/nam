package java_gicho_13;
import java.util.Scanner;
public class C20210412_03 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			try {
				// ������ ���ܸ� ������Ű��
				exfirst();
				//NullPointerException
				int[] d = null;
				System.out.println(d[0]);
				//ArrayIndexOutOfBoundsException
				int[] c = new int[3];  
				System.out.println(c[3]);
				// ArithmeticException
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(a/b);
				
			}catch(ArithmeticException e) {
				System.out.println("0���� ������ �ȵǿ�!!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 ���� �ʰ�!!!");
			}catch(NullPointerException e) {
				nullp();
			}catch(Exception e) {
				System.out.println("�����߻� �ȹٷ� �ϼ���!!!");
				System.out.println(e);
			}finally { //else  --> ������ �����ϴ� �ڵ��
				System.out.println("���α׷� ����");
			}
			
			
		}
		static void ss() throws Exception{
			throw new Exception("����");
		}
		static void exfirst() throws Exception {
			ss();
		}
		static void nullp() {
			System.out.println("�ƴ� ���°� �޶���ϸ� �ȵǿ�!!!");	
		
	}
}