package cloudstudying;

public class pratice42 {

	 
	public static int sum(int[]array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		sum += array[i];
		
		return sum;
	}
	 
	public static void main(String[] args) {
 
		
		int n = 7;
		
		
		String [] week = {"월","화","수","목","금","토","일"};
		int [] user = {581,512,527,495,423,141,236};
		int usersum = sum(user);
		double average = (double) sum(user) / n;	
		
		for(int i = 0; i <  n ; i++) {
			System.out.printf("%s : ", week[i]);
			System.out.printf("%d 명 \n", user[i]);
			
		}
		System.out.printf("사용자 합계 : %d 명 \n", usersum);
		System.out.printf("하루 평균 사용자 : %.2f 명 ", average);
		
	}

}
