package cloudstudying;

public class pratice14 {


	
	public static void main(String[] args) {
		
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		
		int startHours = N1 / 100;
		int startMinutes = N1 % 100;
		
		int startMinutesTime = 0;
		
		int endHours = N2 / 100;
		int endMinutes = N2 % 100;
		
		int endMinutesTime = 0;
		
		int movingMinutesTime = endMinutesTime - startMinutesTime;
		int movingHours = movingMinutesTime / 60;
		int movingMinutes = movingMinutesTime % 60;
		
		System.out.printf("이동시간은 %d시간  %d분 입니다.", movingHours, movingMinutes);
 
	}

}
