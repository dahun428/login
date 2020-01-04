package cloudstudying;

public class pratice62 {

	public static void main(String[] args) {

		int value = 5;
		printfct(value);
		
	}
	public static void printfct(int n) {
		int result = 1;
		System.out.printf("%d! = ",n);
		for (int i = n; i > 0 ; i --) {
			System.out.printf("%d",i);
			result *= i;
		if ( i!= 1 ) {
			System.out.printf("x");
		}
		}
		System.out.printf("= %d",result);
	}

}
