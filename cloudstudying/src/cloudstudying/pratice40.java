package cloudstudying;

public class pratice40 {
	  public static void main(String[] args) {
	    // �迭 ����
	    int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }; // ¦��
	    int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 }; // �Ҽ�
	    
	    // ���
	    int evenSum = sum(evens);
	    int primeSum = sum(primes);
	    
	    // ���
	    System.out.println("0 �̻� 20 �̸��� ¦���� �Ҽ� ��..");
	    System.out.printf("¦���� ��: %d\n", evenSum);
	    System.out.printf("�Ҽ��� ��: %d\n", primeSum);
	  }

	  // ������ �迭�� �Է� �޾� ������ ��ȯ
	  public static int sum(int[] arr) {
	    int sum = 0;
	    
	    for(int i = 0; i < arr.length; i ++) {
	    	sum += arr[i];
	    }
	    
	    return sum;
	  }
	}