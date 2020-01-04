import java.util.Arrays;
import java.util.Scanner;

public class pratice_5 {

	public static void sum() {
		
		
	}
	public static void avg() {
		
	}

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("배열 값을 입력하시오 :");
	      int A = sc.nextInt();
	      int [] kgArray = new int [A];
	      System.out.println(A + "개의 몸무게를 입력하시오  :");

	      for(int i=0; i<A; i++ ) {
	         kgArray[i] = sc.nextInt();
	      }

	    
	      System.out.println(Arrays.toString(kgArray));
	      System.out.println(kgArray / kgArray.length));

	}

}
