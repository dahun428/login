import java.util.Scanner;

public class pratice_4 {

	 static int M, F, T , Total;
	 
	 public static int Total() {
		 
		return M_money() + F_money() + T_money();
	 }
	
	public static  int M_money() {

		return M * 10000;
		
	}
	public static int F_money() {
		
		return F * 5000;
	
	}
	
	public static int T_money() {
		
		return T * 1000;
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("만원권 입력 : ");
		M = sc.nextInt();

		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("오원권 입력 : ");
		F = sc1.nextInt();

		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("천원권 입력 : ");
		T = sc2.nextInt();

		sc.close();
		sc1.close();
		sc2.close();
		
		
		/*
		 * pratice_4.M = 3; pratice_4.F = 5; pratice_4.T = 7;
		 */
		
		System.out.println(Total() + " 원 ");
	}

}
