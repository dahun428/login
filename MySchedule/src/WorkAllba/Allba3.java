package WorkAllba;

import java.util.Scanner;
 

public class Allba3 {

	
	final static int RegularMoney = 8350;
	// �ְ� �ñ�
	final static double OverTimeMoney = 8350 * 1.5;
	// �߰� �ñ�
	
	static int RegularTime, OverTime, daynumber, Monthnumber, ChoiceN; 

	static int H = 1, A = 2, HA = 3;  //ȣ�ڼ���
	
	public void DayInput()  {

		Scanner MonthSc = new Scanner(System.in);
		System.out.println("�� �� �Դϱ�? : ");
		Monthnumber = MonthSc.nextInt();
		Scanner daysc = new Scanner(System.in);
		System.out.println("�� �� �Դϱ�? : ");
		daynumber = daysc.nextInt(); 
	}
	
	
	public void ScannerRun_RT() {
		
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 �� ������ �Ƹ�����Ʈ �ð��� �Է����ּ��� : ");
		Allba3.RegularTime = rTsc.nextInt();
	
	}
	public void ScannerRun_OT() {
	
		Scanner rTsc = new Scanner(System.in);
		System.out.println("07:00 ~ 23:00 �� ������ �Ƹ�����Ʈ �ð��� �Է����ּ��� : ");
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
		
		System.out.println("�Ͼ�Ʈ �� : " + getRegularTimeMoney() + " ��");
	}

	public int getRegularTimeMoney() {
		return RegularMoney * RegularTime;
	}
	public void Ajis() {
		
		System.out.println("�������� �� : "+ (getRegularTimeMoney() + getOverTimeMoney()) + "��");
	}

	public double getOverTimeMoney() {
		return OverTimeMoney * OverTime;
	}
	
	
	
	public void choice() {
		
		System.out.println("���� �˹� �Ѱ��� �Է����ּ��� : ");
		
		Scanner choiceSc = new Scanner(System.in);
		System.out.println("�Ͼ�Ʈ : (1 �Է�)   AJis : (2 �Է�) �Ѵ� : (3 �Է�)\n");
		ChoiceN = choiceSc.nextInt();
		
	}
	
	public void Allrun() {
		

		Allba3 allba3 = new Allba3();
			
		allba3.DayInput();
		allba3.choice();
		allba3.Time(); 
		
		
		System.out.println(" ===========���� ���� ===========");
		System.out.printf("%d�� %d��\n", Monthnumber, daynumber);
		
		//���̽���
		if (ChoiceN ==  H) {
			allba3.Hyatt();
		}else if(ChoiceN ==  A) {
			allba3.Ajis();
		}else if(ChoiceN ==  HA) {
			allba3.Hyatt();
			allba3.Ajis();
		}
	}
	
	
	public static void main(String[] args) {
		
		Allba3 allba2 = new Allba3();
		allba2.Allrun();
		
		
		
		
		
		
		
	
		
		
		
	}

}
 