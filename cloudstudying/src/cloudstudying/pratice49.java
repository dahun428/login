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

		 String [] wk = {"��","ȭ","��","��","��","��","��"};
		 int [] number = { 257,281,234,232,187,99,116};
		 for (int i = 0; i < wk.length; i++) {
			 System.out.printf("%s : %d �� \n",wk[i],number[i]);
		 } 
		 System.out.printf("������ ������ : %d ��\n",sum(number));
		 System.out.printf("�Ϸ���� ������ : %d ��\n",avg(number));

 
}
}