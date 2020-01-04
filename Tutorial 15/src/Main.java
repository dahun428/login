
public class Main {

	public static int p(int number) {
		
	// 5! = 5 * 4 * 3 * 2 * 1
		
	if (number == 1)
		return 1;
	else 
		return number * p(number - 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( " 10번째 피보나치 수열의 숫자는 " + p(5) + " 입니다.");
		
		
	}

}
