
public class MMMAin {

	public static void main(String[] args) {

		schooltable("성적표", "  과학", " 수학", " 영어");
		studentName("최수빈", "최형욱", "임연희" , "고수빈");
		
	}

	public static void schooltable(String text, String text1, String text2, String text3) {
		
		System.out.print(text);
		System.out.print(text1);
		System.out.print(text2);
		System.out.print(text3);
		
	}
	
	public static void studentName(String textn, String textn1,String textn2,String textn3) {
		System.out.println();
		System.out.println(textn);
		System.out.println(textn1);
		System.out.println(textn2);
		System.out.println(textn3);
		
	}
	
}
