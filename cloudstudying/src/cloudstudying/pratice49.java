package cloudstudying;

public class pratice49 {
	
	public static int sum(int []array ) {
		int sum = 0;		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			
		}
		return sum;
	}
	public static int avg(int[]array ) {
	 
		return sum(array) / array.length;
	}
 	 
	public static void main(String[] args) {

		 String [] wk = {"월","화","수","목","금","토","일"};
		 int [] number = { 257,281,234,232,187,99,116};
		 for (int i = 0; i < wk.length; i++) {
			 System.out.printf("%s : %d 명 \n",wk[i],number[i]);
		 } 
		 System.out.printf("일주일 접속자 : %d 명\n",sum(number));
		 System.out.printf("하루평균 접속자 : %d 명\n",avg(number));

 
}
}