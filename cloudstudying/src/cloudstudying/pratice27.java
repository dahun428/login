package cloudstudying;

import java.util.Scanner;

public class pratice27 {
	

	  static double t;
	  static double w;
	  static double bmi;
	  
	public static double calculate(double weight, double tall) {
		
		return weight / (tall * tall);
	}
	 
	public static String result(double bmi) {
		String result = "";
		if( bmi > 30) {
			result = "비만";
		}else if (bmi > 25) {
			result = "과체중";
		}else if (bmi > 18.5) {
			result = "정상";
		}else {
			result = "저체중";
		}
		
		return result;
	}
	public static void bmi() {
		
	 bmi = calculate(w,t);
			
	}
 
	  public static void main(String[] args) {
		
		  
		  
		  Scanner sc1 = new Scanner(System.in);
		  System.out.println("키를 입력하세요");
		  t = sc1.nextDouble();
		  Scanner sc2 = new Scanner(System.in);
		  System.out.println("체중을 입력하세요");
		  w = sc2.nextDouble();
		  sc1.close();
		  sc2.close();
		  pratice27.bmi();
			
		
		  System.out.printf("BMI : %.2f(%.1fkg, %.2fm)\n", bmi , w , t);
		  System.out.printf("결과  : %s입니다.\n", result(bmi));
		 
		  }

	}