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
		
		
		String [] week = {"��","ȭ","��","��","��","��","��"};
		int [] user = {581,512,527,495,423,141,236};
		int usersum = sum(user);
		double average = (double) sum(user) / n;	
		
		for(int i = 0; i <  n ; i++) {
			System.out.printf("%s : ", week[i]);
			System.out.printf("%d �� \n", user[i]);
			
		}
		System.out.printf("����� �հ� : %d �� \n", usersum);
		System.out.printf("�Ϸ� ��� ����� : %.2f �� ", average);
		
	}

}