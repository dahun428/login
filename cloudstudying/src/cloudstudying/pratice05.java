package cloudstudying;

public class pratice05 {

	
	
	public static void main(String[] args) {

		
		double r = 3;
		double h = 4;
		
		double volume = Math.PI * r * r * h;
		double surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
		
		System.out.printf("반지름  : %.2f\n" , r);
		System.out.printf("높이 : %.2f\n" , h);
		System.out.printf("원기둥의 부피  : %.2f\n" , volume);
		System.out.printf("원기둥의 겉넓이 : %.2f\n", surfaceArea);
	}

}
