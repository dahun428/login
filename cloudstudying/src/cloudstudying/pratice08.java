package cloudstudying;

import java.util.ArrayList;
import java.util.Scanner;

class H_{
	
	double Mon, Tue, Wen, Thu, Fri;
	double avg;
	
	 
	}
 


public class pratice08 extends H_{

	public  void Monday() {
		
		Scanner MSc = new Scanner(System.in);
		System.out.println("������ ������ �Է�  : ");
		Mon = MSc.nextDouble();
		
		}

	public void Tuesday() {
		
		Scanner TSc = new Scanner(System.in);
		System.out.println("ȭ���� ������ �Է�  : ");
		Tue = TSc.nextDouble();
		System.out.println("������� ������ : " + (Mon - Tue));
		  
		}
	public void Wendsday() {
		
		Scanner WSc = new Scanner(System.in);
		System.out.println("������ ������ �Է�  : ");
		Wen = WSc.nextDouble();
		System.out.println("������� ������ : " + (Tue - Wen));
		 
	
		
		}
	public void Thursday() {
		
		Scanner ThSc = new Scanner(System.in);
		System.out.println("����� ������ �Է�  : ");
		Thu = ThSc.nextDouble();
		System.out.println("������� ������ : " + (Wen - Thu));
		 
	
		}
	public void Friday() {
		
		Scanner FSc = new Scanner(System.in);
		System.out.println("�ݿ��� ������ �Է�  : ");
		Fri = FSc.nextDouble();
		System.out.println("������� ������ : " + (Thu - Fri));
		
		
		}	
	public void avg() {
		double avg = (Mon + Tue + Wen + Thu + Fri) / 5;
		System.out.println("������ ��� �� : " + avg);
	}
	
	
	public void Run() {
		pratice08 p = new pratice08();
		p.Monday();
		p.Tuesday();
		p.Wendsday();
		p.Thursday();
		p.Friday();
		System.out.println(" ��� ������ ���� ������ �����ϴ�.");
		p.avg();

		
		
	}
	
	public static void main(String[] args) {

 		pratice08 p = new pratice08();
 		
 		p.Run();
			}

}
