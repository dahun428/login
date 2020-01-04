
public class Main {
	
	public static int max(int a, int b) {
		return (a > b ) ? a : b;
		
	}
	
	public static int function (int a, int b, int c) {
		
		int result = max(a, b);
		result = max(result, c);
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 345 , 567 , 789 중에거 가장 큰 값은 : " + function(345, 567, 789) + " 입니다.");
		
	
	}

}
