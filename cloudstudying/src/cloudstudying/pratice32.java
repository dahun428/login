package cloudstudying;

public class pratice32 {

 
	public static int sum(int max) {
	    int sum = 0;
 	    for (int i = 1; i <= max; i++) {      
	      sum += i;
	    } 
	    return sum ;
	  }
	
 	public static void main(String[] args) {
	 
 	     int n = 5; 
 	     int result = sum(n);
 	     System.out.printf("Á¤¼öÀÇ ÃÑÇÕ(1~%d) => %d", n, result);
		
		}
}
