package cloudstudying;

public class pratice26 {

	double T ;//Ű
	double W ;//ü��
	static double BMI;//�񸸵� ����
	
	public void BMI(double W, double T) {
		this.T = T;
		this.W = W;
		BMI = W / (T * T);
		
	} 
	public void result() {

		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", BMI, W , T);
		
		/*
		 * System.out.printf( "BMI : %2.f", BMI );
		 */if(BMI > 30) {
			System.out.println("��� : ���Դϴ�.");
		}
		else if(BMI >= 25) {
			System.out.println("��� : ��ü���Դϴ�.");
		}
		else if(BMI >= 18.5) {
			System.out.println("��� : �����Դϴ�.");
		}
		else {
			System.out.println("��� : ��ü���Դϴ�.");
		}

	}
	public static void main(String[] args) {
 
		pratice26 p26 = new pratice26();
		p26.BMI(81.6, 1.76);
		p26.result();

		 
	}

}