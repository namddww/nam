package java_gicho_09;

public class C20210402_09 {
	public static void main(String[] args) {
		boolean flag = true; // �Ҹ������� �����ϸ�, 90%�� while���̴�!
		
//		while(flag) = ������ ���ư���..
		int sum = 0;
		int i = 0;
		while(flag) {  // �ϴ� while���̴ϱ� �������� ������ if�� ���Ͷ�
			i++;
			sum+=i;
			if (i>=10) {
				flag = false;
			}
		}
		System.out.println(sum);
	}
}

