package cloudstudying;

public class pratice29 {
	  public static void main(String[] args) {
	    printPay(10.00, 40);
	    printPay(10.00, 50);
	    printPay(7.50, 38);
	    printPay(8.50, 66);
	  }
	  
	  // �ñް� ���� �ð��� �Է¹޾�, �ֱ��� ���
	  public static void printPay(double basePay, int hours) {
	    double pay = 0.0;
	    /* �ش� �޼ҵ带 �ϼ��ϼ���. */
	    if((basePay >= 8.0)&&(hours <= 60)){
	      if(hours > 40){
	        pay = basePay*40 + basePay*(hours-40)*1.5;
	      }else{
	        pay = basePay*hours;
	      }
	      System.out.printf("$ %.2f\n", pay);  
	    }else if(hours > 60){
	      System.out.println("���� �ñ� ����!");
	    }else if(basePay < 8.00){
	      System.out.println("�ʰ� �ٹ��ð� ����!");
	    }
	    
	  }
	}