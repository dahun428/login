package cloudstudying;

public class pratice63 {
	  public static void main(String[] args) {
	    // �迭 ����
	    int[] bacteriaCountLogs = new int[10];
	    
	    // ��ü �� ���
	    writeLog(bacteriaCountLogs);
	    
	    // ��� ���
	    printLog(bacteriaCountLogs);
	  }

	  // ���׸����� ��ü ���� ���
	  public static void writeLog(int[] logs) {
		   for(int j=0; j<=9; j++) {
			    logs[j]=(int)Math.pow(2,j);
			    }
		  
	  }

	  // �迭�� �Է¹޾�, �ش� ��Ҹ� ��� ���
	  public static void printLog(int[] arr) {
	    System.out.printf("[");
	    for (int i = 0; i < arr.length; i++) {
	      System.out.printf("%d", arr[i]);
	      if (i != arr.length - 1) {
	        System.out.printf(", ");
	      }
	    }
	    System.out.printf("]");
	  }
	}
