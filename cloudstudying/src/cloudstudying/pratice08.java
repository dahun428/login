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
		System.out.println("월요일 몸무게 입력  : ");
		Mon = MSc.nextDouble();
		
		}

	public void Tuesday() {
		
		Scanner TSc = new Scanner(System.in);
		System.out.println("화요일 몸무게 입력  : ");
		Tue = TSc.nextDouble();
		System.out.println("전날대비 몸무게 : " + (Mon - Tue));
		  
		}
	public void Wendsday() {
		
		Scanner WSc = new Scanner(System.in);
		System.out.println("수요일 몸무게 입력  : ");
		Wen = WSc.nextDouble();
		System.out.println("전날대비 몸무게 : " + (Tue - Wen));
		 
	
		
		}
	public void Thursday() {
		
		Scanner ThSc = new Scanner(System.in);
		System.out.println("목요일 몸무게 입력  : ");
		Thu = ThSc.nextDouble();
		System.out.println("전날대비 몸무게 : " + (Wen - Thu));
		 
	
		}
	public void Friday() {
		
		Scanner FSc = new Scanner(System.in);
		System.out.println("금요일 몸무게 입력  : ");
		Fri = FSc.nextDouble();
		System.out.println("전날대비 몸무게 : " + (Thu - Fri));
		
		
		}	
	public void avg() {
		double avg = (Mon + Tue + Wen + Thu + Fri) / 5;
		System.out.println("몸무게 평균 값 : " + avg);
	}
	
	
	public void Run() {
		pratice08 p = new pratice08();
		p.Monday();
		p.Tuesday();
		p.Wendsday();
		p.Thursday();
		p.Friday();
		System.out.println(" 평균 몸무게 값은 다음과 같습니다.");
		p.avg();

		
		
	}
	
	public static void main(String[] args) {

 		pratice08 p = new pratice08();
 		
 		p.Run();
			}

}
