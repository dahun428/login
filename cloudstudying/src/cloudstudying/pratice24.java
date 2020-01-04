package cloudstudying;
public class pratice24 {
	  public static void main(String[] args) {
	    // ∫Øºˆ ª˝º∫
	    int a = 13;
	    int b = 7;
	    int c = 10;
	    
	    // ∞·∞˙ √‚∑¬
	    System.out.printf("%d√˛ -> %s ø§∑π∫£¿Ã≈Õ\n", a, guide(a));
	    System.out.printf("%d√˛ -> %s ø§∑π∫£¿Ã≈Õ\n", b, guide(b));
	    System.out.printf("%d√˛ -> %s ø§∑π∫£¿Ã≈Õ\n", c, guide(c));
	  }
	  
	  public static String guide(int floor) {
	   
		  if ( floor < 11) {
			  return "¿˙√˛";  
		  }
		  else {
			  return "∞Ì√˛";
		  }
	  }
	}