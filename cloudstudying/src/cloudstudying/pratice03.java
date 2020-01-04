package cloudstudying;
  
public class pratice03 {

	final double PI = 3.14;
	 double r, h;
	
	 public double a ; 
	 public double b ;

	 public double surface() {
		 return r * r * PI;
	 }
	 
	public void a(double r, double h){
		this.r = r;
		this.h = h;
		
		a = surface() * h;
		
		System.out.println("¿ø±âµÕÀÇ ºÎÇÇ : " + a);
	}
	public void b(double r, double h) {
		this.r = r;
		this.h = h;
		b = surface() * 2 + 2 * PI * r * h;
		System.out.println("¿ø±âµÕÀÇ °Ñ ³ÐÀÌ : " + b);
	}
	 
	
	
	public static void main(String[] args) {
	
		pratice03 p3 = new pratice03();
		p3.a(3,4);
		p3.b(3, 4);
	
		
	}

}
