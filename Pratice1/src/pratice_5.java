import java.util.Arrays;
import java.util.Scanner;

public class pratice_5 {

	public static void sum() {
		
		
	}
	public static void avg() {
		
	}

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("�迭 ���� �Է��Ͻÿ� :");
	      int A = sc.nextInt();
	      int [] kgArray = new int [A];
	      System.out.println(A + "���� �����Ը� �Է��Ͻÿ�  :");

	      for(int i=0; i<A; i++ ) {
	         kgArray[i] = sc.nextInt();
	      }

	    
	      System.out.println(Arrays.toString(kgArray));
	      System.out.println(kgArray / kgArray.length));

	}

}
