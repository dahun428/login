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
		System.out.println("�� �� �Դϱ�? : ");
		Monthnumber = MonthSc.nextInt();
		Scanner daysc = new Scanner(System.in);
		System.out.println("�� �� �Դϱ�? : ");
		daynumber = daysc.nextInt(); 
	}
	
	public void Time() {
		 
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 �� ������ �Ƹ�����Ʈ �ð��� �Է����ּ��� : ");
		Allba.RegularTime = rTsc.nextInt();
		Scanner osc = new Scanner(System.in);
		System.out.println("23:00 ~ 06:00 �� ������ �Ƹ�����Ʈ �ð��� �Է����ּ��� : ");
		Allba.OverTime = osc.nextInt();
	 }
	
	public double Hyatt() {
		return RegularMoney * RegularTime;
	}
	public double Ajis() {
		
		return RegularMoney * RegularTime + OverTimeMoney * OverTime;
	}
	
	
	
	public static void choice() {
		
		System.out.println("���� �˹� �Ѱ��� �Է����ּ��� : ");
		
		Scanner choiceSc = new Scanner(System.in);
		System.out.println("�Ͼ�Ʈ : H �Է� \n AJis : A �Է�\n �Ѵ� : HA\n");
		ChoiceN = choiceSc.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		Allba allba = new Allba();
		allba.DayInput();
		allba.Time(); 
		
		
		System.out.println(" ===========���� ���� ===========");
		System.out.printf("%d�� %d��\n", Monthnumber, daynumber);
		
		
		if (ChoiceN == H) {
			System.out.printf("�Ͼ�Ʈ �� : %.0f ��\n", allba.Hyatt());
		}else if(ChoiceN == A) {
			System.out.printf("�������� �� : %.0f ��" , allba.Ajis());
		}else if(ChoiceN == HA) {
			System.out.printf("�Ͼ�Ʈ �� : %.0f ��\n", allba.Hyatt());
			System.out.printf("�������� �� : %.0f ��" , allba.Ajis());
		}
		
		
		
		
		
	
		
		
		
	}

}
 