package cloudstudying;

public class pratice54 {

	public static void main(String[] args) {
 
		
		double startWeight = 72.4;
		int months =  5 ;
		
		double result = weight(startWeight, months);
		
		System.out.printf("%d 개월 이후의 몸무게 : %.2fkg" , months , result);
		
	}
	public static double weight(double currentWeight, int months) {
		
		double expectWeight  = currentWeight;
		for(int i = 0; i < months; i++) {
			expectWeight += 0.231;
		}
		
		return expectWeight;
	}

}
