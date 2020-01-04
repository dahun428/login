package WorkAllba;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Scanner;
 

public class Allba {

	
	final static int RegularMoney = 8350;
	final static double OverTimeMoney = 8350 * 1.5;

	int WorkingTotalTime;
	int WorkingStartTime;
	int WorkingEndTime;
	static int RegularTime;
	static int OverTime;
	static int daynumber;
	static int Monthnumber;
	static int ChoiceN;
	static int H, A;
	static int HA;
	
	
	String Ajis, Hyatt;
	 
	
	public void DayInput()  {

		Scanner MonthSc = new Scanner(System.in);
		System.out.println("몇 월 입니까? : ");
		Monthnumber = MonthSc.nextInt();
		Scanner daysc = new Scanner(System.in);
		System.out.println("몇 일 입니까? : ");
		daynumber = daysc.nextInt(); 
	}
	
	public void Time() {
		 
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 시 까지의 아르바이트 시간을 입력해주세요 : ");
		Allba.RegularTime = rTsc.nextInt();
		Scanner osc = new Scanner(System.in);
		System.out.println("23:00 ~ 06:00 시 까지의 아르바이트 시간을 입력해주세요 : ");
		Allba.OverTime = osc.nextInt();
	 }
	
	public double Hyatt() {
		return RegularMoney * RegularTime;
	}
	public double Ajis() {
		
		return RegularMoney * RegularTime + OverTimeMoney * OverTime;
	}
	
	
	
	public static void choice() {
		
		System.out.println("금일 알바 한곳을 입력해주세요 : ");
		
		Scanner choiceSc = new Scanner(System.in);
		System.out.println("하얏트 : H 입력 \n AJis : A 입력\n 둘다 : HA\n");
		ChoiceN = choiceSc.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		Allba allba = new Allba();
		allba.DayInput();
		allba.Time(); 
		
		
		System.out.println(" ===========금일 정산 ===========");
		System.out.printf("%d월 %d일\n", Monthnumber, daynumber);
		
		
		if (ChoiceN == H) {
			System.out.printf("하야트 돈 : %.0f 원\n", allba.Hyatt());
		}else if(ChoiceN == A) {
			System.out.printf("에이지스 돈 : %.0f 원" , allba.Ajis());
		}else if(ChoiceN == HA) {
			System.out.printf("하야트 돈 : %.0f 원\n", allba.Hyatt());
			System.out.printf("에이지스 돈 : %.0f 원" , allba.Ajis());
		}
		
		
		
		
		
	
		
		
		
	}

}
 