package cloudstudying;

public class pratice53 {
	  public static void main (String[] args) {
	    // �Է°� �ޱ�
	    double start = 7.24;
	    int after = 5;
	    
	    // ���
	    double result = weight(start, after);
	    
	    // ��� ���
	    System.out.printf("%d���� �� ���� ������ => %fkg", after, result);
	  }
	  
	  // ���� �����Կ� n���� �� ���� �Է¹޾� ���� �����Ը� ��ȯ
	  public static double weight(double currentWeight, int months) {
	    double expectedWeight = currentWeight;
	    for (int i = 0 ; i < 5; i++) {
	      expectedWeight += 0.231;
	    }
	    return expectedWeight;
	  }
	}