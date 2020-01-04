package cloudstudying;

public class pratice10 {

	double pay;
	double basepay = 8000;
	double workingHours;
	
	public void pay (int time) {
		
		this.workingHours = time;
		pay = basepay * workingHours;
		System.out.println("이번달 급여  : " + pay);
	}
	
	public static void main(String[] args) {
		pratice10 p10 = new pratice10();
		p10.pay(160);

		
 		
	}

}
