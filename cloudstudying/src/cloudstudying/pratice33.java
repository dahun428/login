package cloudstudying;

public class pratice33 {
	  public static void main(String[] args) {
	    // 1���� 10���� ���� ��� �� ���
	    printSum(1, 10);
	  }

	  // start���� end������ ������ ���
	  
	  
	  public static void printSum(int start, int end) {
	    // ���� ����
	    int sum = 0;

	    // ���� ���
	    for (int i = start; i <= end; i++) {
	      System.out.printf("%d", i);
	      sum += i;

	      // end(������ ����)�� ���,
	      if (i == end) {

	      break;
	      }
	      
	      System.out.printf(" + ");
	    }
	    
	    // ��� ���
	    System.out.printf("\n=> %d", sum);
	  }
	}