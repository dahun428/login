package cloudstudying;

public class pratice64 {
	  public static void main(String[] args) {
	    // �迭 ����
	    String[] names = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
	    int[] scores = { 65 , 74 , 23 , 75 , 68 , 96 , 88 , 98 , 54};
	    
	    // 1�� �ε��� �˻�
	    int i = topIndex(scores);
	    
	    // ��� ���
	    System.out.printf("1��: %s(%d��)\n", names[i], scores[i]);
	  }

	  // ������ �迭�� �Է¹޾� ���� ū ���� �ε����� ��ȯ
	  public static int topIndex(int[] arr) {
		 
		  int max = 0;
		   
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]>arr[max]) {
	            max = i;
	          }
	      }
	      return max;
	  }
	}