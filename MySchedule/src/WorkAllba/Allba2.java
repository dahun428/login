package WorkAllba;

import java.util.Scanner;
 

public class Allba2 {

	
	final static int RegularMoney = 8350;
	final static double OverTimeMoney = 8350 * 1.5;
 
	static int RegularTime, OverTime, daynumber, Monthnumber, ChoiceN; 
	static int H = 1, A = 2, HA = 3;  //호텔선택
	
	public void DayInput()  {

		Scanner MonthSc = new Scanner(System.in);
		System.out.println("몇 월 입니까? : ");
		Monthnumber = MonthSc.nextInt();
		Scanner daysc = new Scanner(System.in);
		System.out.println("몇 일 입니까? : ");
		daynumber = daysc.nextInt(); 
	}
	
	
	public void ScannerRun_RT() {
		
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 시 까지의 아르바이트 시간을 입력해주세요 : ");
		Allba3.RegularTime = rTsc.nextInt();
	
	}
	public void ScannerRun_OT() {
		
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 시 까지의 아르바이트 시간을 입력해주세요 : ");
		Allba3.RegularTime = rTsc.nextInt();
	
	}	
	public void Time() {
		if (ChoiceN == 1) {
			ScannerRun_RT();
		}else {
			ScannerRun_RT();
			ScannerRun_OT();
		}
	}
			
	
	public void Hyatt() {
		
		System.out.println("하야트 돈 : " + getRegularTimeMoney() + " 원");
	}

	public int getRegularTimeMoney() {
		return RegularMoney * RegularTime;
	}
	public void Ajis() {
		
		System.out.println("에이지스 돈 : "+ (getRegularTimeMoney() + getOverTimeMoney()) + "원");
	}

	public double getOverTimeMoney() {
		return OverTimeMoney * OverTime;
	}
	
	
	
	public void choice() {
		
		System.out.println("금일 알바 한곳을 입력해주세요 : ");
		
		Scanner choiceSc = new Scanner(System.in);
		System.out.println("하얏트 : (1 입력)   AJis : (2 입력) 둘다 : (3 입력)\n");
		ChoiceN = choiceSc.nextInt();
		
	}
	
	public void Allrun() {
		

		Allba3 allba2 = new Allba3();
			
		allba2.DayInput();
		allba2.choice();
		allba2.Time(); 
		
		
		System.out.println(" ===========금일 정산 ===========");
		System.out.printf("%d월 %d일\n", Monthnumber, daynumber);
		
		//초이스값
		if (ChoiceN ==  H) {
			allba2.Hyatt();
		}else if(ChoiceN ==  A) {
			allba2.Ajis();
		}else if(ChoiceN ==  HA) {
			allba2.Hyatt();
			allba2.Ajis();
		}
	}
	
	
	public static void main(String[] args) {
		
		Allba3 allba2 = new Allba3();
		allba2.Allrun();
		
		
		
		
		
		
		
	
		
		
		
	}

}
 