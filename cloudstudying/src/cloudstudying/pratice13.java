package cloudstudying;

public class pratice13 {

	double Euro, dollar,Won;
	
	public void Euro() {
		Euro = 1281.62664;
	}
	public void dollar() {
		dollar = 1091.70306;
	}
	public void Won(double Euro, double dollar) {
		
		this.Euro = Euro;
		this.dollar = dollar;
		 
		Won = Euro * dollar;
		
		System.out.printf("���� : %.2f E \n " , Euro);
		System.out.printf("�޷� : %.2f $ \n" , dollar);
		System.out.printf("ȯ������� : %.2f won \n" , Won);
		
	}
	
	public static void main(String[] args) {
 
		pratice13 p13 = new pratice13();
		p13.Won(58,13);
		
	}

}
