package WorkAllba;

import java.util.Scanner;

public class Workplace {
 	
			
	int RegularTimeMoney = 8350;
	double OverTimeMoney = 8350 * 1.5;
	double HourMoney = RegularTimeMoney + OverTimeMoney;
	
	//�ñ�
	
	double RegularTime,OverTime;
	double AllTime = RegularTime + OverTime;

	

	
	
	int Hour = HourB - HourA;
	static int HourA,HourB; 
	
	//�ð�
	
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
	 	
	
//�ð� �Է����
	Scanner scHourA = new Scanner(System.in);
	System.out.println("�ð��� �Է��ϼ��� : ");
	HourA = (int) scHourA.nextDouble();
	
	Scanner scHourB = new Scanner(System.in);
	System.out.println("�ð��� �Է��ϼ��� : ");
	HourB = (int) scHourB.nextDouble();
	
	scHourA.close();
	scHourB.close();
	
	
//���	
	System.out.println(HourB);
	System.out.printf("�Ͼ�Ʈ �� : %.1f\n ��", wp.Hyatt());
	System.out.printf("�������� �� : %.1f ��" , wp.Ajis());
	}

}
