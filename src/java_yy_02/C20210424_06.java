package java_yy_02;

public class C20210424_06 {
	public static void main(String[] args) {
		BB4 a = new BB4("blue", 4);
		BB4 b = new BB4("blue", "현대", 1);
	}

}
class BB4 {
	String color;
	String company = "기아";
	int type ;
	
	BB4(String c, String com, int t){
		color = c;
		company = com;
		type = t;
	}
	
	BB4(String c, int t){
		color = c;
		type = t;
	}
}
