package cloudstudying;

class Height{
	
	double Mon = 78.4;
	double Tue = Mon + 0.4;
	double Wen = Tue - 0.6;
	double Thu = Wen + 0.1;
	double Fri = Thu + 0.8;
	double avg = (Mon+Tue+Wen+Thu+Fri)/5;
	 
}
public class pratice07 extends Height{
	 
	public static void main(String[] args) {

		Height h = new Height();
		
		System.out.println("�� : " + h.Mon);

		System.out.println("ȭ : " + h.Tue);

		System.out.println("�� : " + h.Wen);

		System.out.println("�� : " + h.Thu);

		System.out.println("�� : " + h.Fri);
		
		System.out.println("��� ������ : " + h.avg);
	}

}
