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
		System.out.printf("총 근무 시간 : %.1f 시간 \n", w);
		System.out.printf("기본시급 : %.1f $ \n" , b);
		System.out.printf("초과시간 : %.1f 시간 \n" , a);
	 	System.out.printf("총급여 : %.1f $ \n", Payment());

	}
	public void run_if() {

		if( w > 40) {
			System.out.println("-----경고----\n" + "주당 40시간을 초과하였습니다.");
			}
		if (a > 0) {
			System.out.println("-----경고----\n"+"초과시간은 " + a + "시간 입니다.");
		if(w > 60) {
			System.out.println("-----경고----\n"+"주당 60시간을 초과하였습니다.");
		}

		}
		
	} 
	public static void main(String[] args) {
		
		
  	pratice28 p28 = new pratice28(); 
  	p28.run();
	p28.run_if();	

  	
		/*
		 * System.out.println("총 근무 시간을 입력하세요 : ");
		 * System.out.println("기본 시급을 입력하세요 : ");
		 * System.out.println("주당 근무 40 시간 기준 급여 : " + "초과분 급여 : ");
		 * System.out.println("해당 인원의 주당 근무 시간이 60시간을 초과하였습니다.");
		 */			
	}

}
