package cloudstudying;
public class pratice60 {
	  public static void main(String[] args) {
	    // n �� ����� 3���� �� ���
	    printCombos(11);
	  }

	  public static void printCombos(int n) {
	    int count = 0;
	    for (int i = 0; i <= n; i++) {
	      for (int j = 0; j <= n; j++) {
	        for (int k = 0; k <= n; k++) {
	          if (i*j*k==n) {
	            System.out.printf("%d = %d x %d x %d\n", n, i, j, k);
	            count++;
	          }
	        }
	      }
	    }
	    System.out.println("======================");
	    System.out.printf("����� ��: %d\n", count);
	  }
	}