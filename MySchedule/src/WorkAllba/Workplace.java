package WorkAllba;

import java.util.Scanner;

public class Workplace {
 	
			
	int RegularTimeMoney = 8350;
	double OverTimeMoney = 8350 * 1.5;
	double HourMoney = RegularTimeMoney + OverTimeMoney;
	
	//시급
	
	double RegularTime,OverTime;
	double AllTime = RegularTime + OverTime;

	

	
	
	int Hour = HourB - HourA;
	static int HourA,HourB; 
	
	//시간
	
	public int WorkingHour(int HourA, int HourB) {
	
		Workplace.HourA = HourA;
		Workplace.HourB = HourB;

		
		
		return Hour = HourB - HourA;
	}
	 
	
	
	public double Hyatt() {
		
	 return RegularTimeMoney * WorkingHour(HourA, HourB);
	 
	}
	
	public double Ajis() {
		return  (RegularTimeMoney + OverTimeMoney) * WorkingHour(HourA, HourB) ;
	}
	
	
	public static void main(String[] args) {

	Workplace wp = new Workplace();
	 	
	
//시간 입력출력
	Scanner scHourA = new Scanner(System.in);
	System.out.println("시간을 입력하세요 : ");
	HourA = (int) scHourA.nextDouble();
	
	Scanner scHourB = new Scanner(System.in);
	System.out.println("시간을 입력하세요 : ");
	HourB = (int) scHourB.nextDouble();
	
	scHourA.close();
	scHourB.close();
	
	
//출력	
	System.out.println(HourB);
	System.out.printf("하야트 돈 : %.1f\n 원", wp.Hyatt());
	System.out.printf("에이지스 돈 : %.1f 원" , wp.Ajis());
	}

}
