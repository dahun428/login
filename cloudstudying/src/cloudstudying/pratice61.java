package cloudstudying;

public class pratice61 {
	  public static void main(String[] args) {
	    // �Է°� �ޱ�
	    int number = 5;
	    
	    // ��� ���
	    printFactorial(number);
	  }

	  // ���� n�� �Է¹޾� n!�� ����� ���
	  public static void printFactorial(int n) {
	    int result = 1;
	    System.out.printf("%d! = ", n);
	    for (int i = n; i > 0; i--) {
	      System.out.printf("%d", i);
	      result *= i; // �ش� ������ �����ϼ���.
	      if (i != 1) {
	        System.out.printf(" x ");
	      }
	    }
	    System.out.printf(" = %d\n", result);
	  }
	}
