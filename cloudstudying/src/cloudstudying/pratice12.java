package cloudstudying;

public class pratice12 {

	double F;
	double C;
	public void C(int F) {
		this.F = F; 
		C = (F - 32) / 1.8;
		System.out.println(F + " È­¾¾´Â  " + C + "  ¼·¾¾ÀÔ´Ï´Ù.");
	}
	
	public static void main(String[] args) {
		
		pratice12 p12 = new pratice12();
		p12.C(77);

		
		
	}

}
