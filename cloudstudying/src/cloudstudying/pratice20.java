package cloudstudying;

public class pratice20 {

	int hp;
	int mp;
	
	public static int hp() {
		
		int hpstatus = 1500; 
				/*(int) (5000 * Math.random());*/
		return  hpstatus;
				}
	public static int mp() {
		
		int mpstatus = 2000;
				/*(int) (5000 * Math.random());*/
		return  mpstatus;
		
	}

	
	public static void main(String[] args) {
		pratice20.hp();
		pratice20.mp();
		
		if ( hp() >= 2000) {
			
			if ( mp() >= 2000) {
				
				System.out.println("������ ���� �Ϸ�");
				
			}
			else {
				System.out.println("������ �����մϴ�.");
			}
		
			
		}
		else if (mp() >= 2000){
			System.out.println("ü���� �����մϴ�.");
			
			
		}
		else {
			System.out.println("ü�°� ������ �����մϴ�.");
		}
 

		
	}

}
