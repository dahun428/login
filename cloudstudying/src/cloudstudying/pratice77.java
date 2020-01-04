package cloudstudying;

import java.util.ArrayList;

public class pratice77 {

	public static void main(String[] args) {
  
		
		Bicycle_1 b1 = new Bicycle_1("ºÎ¸ª", 21.74 ,899000);
		Bicycle_1 b2 = new Bicycle_1("¾Å¾Å", 12.57, 495000);
		
		System.out.printf("Bicycle A : %s, %.1f, %d\n", b1.b_name, b1.b_weight, b1.b_price);
		System.out.printf("Bicycle B : %s, %.1f, %d", b2.b_name, b2.b_weight, b2.b_price); 
	}

}


class Bicycle_1 {
	
	String b_name;
	double b_weight ;
	int b_price;

	Bicycle_1(String n, double w, int p){
		
		b_name = n;
		b_weight = w;
		b_price = p;
	}
	  
}
