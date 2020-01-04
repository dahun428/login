package CalcaulatorPrint;

import java.util.Scanner;


class caca{


	static double PI = 3.14;
	static int left, right;
	
	
	//public void setOperator(int a1, int b1){
		
		//this.left = a1;
		//this.right = b1;
		
	//}
	
	
	public void sum() {
		System.out.println("다음 합계 값 : "  + (left + right));
	}
	public void avg() {
		System.out.println("다음 평균 값 : " + ((left + right)/2));
	}
	

}





public class Main3 {

	private static Scanner sc2;
	private static Scanner sc;

	public static void main(String[] args) {

	caca c1 = new caca();
		
		 sc = new Scanner(System.in); 
		 System.out.println("첫번째 정수 값을 입력하세요");
		 caca.left = sc.nextInt();
		 
		/*
		 * c1.setOperator(10, 20); c1.sum(); c1.avg();
		 */
	
		  sc2 = new Scanner(System.in); 
		  System.out.println("두번째 정수 값을 입력하세요");
		  caca.right = sc2.nextInt();
		 
		  c1.sum();
		  c1.avg();
	
		/*
		 * c2.setOperator(30, 40); c2.sum(); c2.avg();
		 */
	
	}

}
