package cloudstudying;

 
public class pratice28 {

	double workingHour;
	double basePayment;
	double Payment;
	double b = 8;
	double w  = 70;
	double a = w - 40;

	
	public double workingHour(double w) {
			
		return w;
	} 
	 
	public  double baseHourPay(double b) {
	 	return b ;
	}
	public  double Payment() {
		return basePayment() + outOfPayment();
	}

	public double outOfPayment() {
		return a * 1.5 * b;
	}

	public double basePayment() {
		return w * b;
	}
	public void run() {
		System.out.printf("�� �ٹ� �ð� : %.1f �ð� \n", w);
		System.out.printf("�⺻�ñ� : %.1f $ \n" , b);
		System.out.printf("�ʰ��ð� : %.1f �ð� \n" , a);
	 	System.out.printf("�ѱ޿� : %.1f $ \n", Payment());

	}
	public void run_if() {

		if( w > 40) {
			System.out.println("-----���----\n" + "�ִ� 40�ð��� �ʰ��Ͽ����ϴ�.");
			}
		if (a > 0) {
			System.out.println("-----���----\n"+"�ʰ��ð��� " + a + "�ð� �Դϴ�.");
		if(w > 60) {
			System.out.println("-----���----\n"+"�ִ� 60�ð��� �ʰ��Ͽ����ϴ�.");
		}

		}
		
	} 
	public static void main(String[] args) {
		
		
  	pratice28 p28 = new pratice28(); 
  	p28.run();
	p28.run_if();	

  	
		/*
		 * System.out.println("�� �ٹ� �ð��� �Է��ϼ��� : ");
		 * System.out.println("�⺻ �ñ��� �Է��ϼ��� : ");
		 * System.out.println("�ִ� �ٹ� 40 �ð� ���� �޿� : " + "�ʰ��� �޿� : ");
		 * System.out.println("�ش� �ο��� �ִ� �ٹ� �ð��� 60�ð��� �ʰ��Ͽ����ϴ�.");
		 */			
	}

}