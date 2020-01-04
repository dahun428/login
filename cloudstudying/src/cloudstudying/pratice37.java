package cloudstudying;

public class pratice37 {

	public static void main(String[] args) {
 
		String[] w = {"¿ù" , "È­", "¼ö", "¸ñ", "±Ý"};
		int[] ame = {52, 50, 55, 42, 38};
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
		
			System.out.printf("%s : %d ÀÜ \n",w[i],ame[i]);
			sum += ame[i];
			
		} 
		System.out.printf("ÃÑ ÆÇ¸Å·® : %d ÀÜ",sum);
 
	}

}
