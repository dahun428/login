package cloudstudying;

class cut{
	
	int D,S,T;
	int a,b,c;
	public void D(int a){
		
		D = a * 2500;
		System.out.println("������ : " + a + "��" + D + "���Դϴ�.");
		
	}
	public void S(int b){
		
		S = b * 700;
		System.out.println("Ƣ�� : " + b + "��" + S + "���Դϴ�.");
		
	}

	public void T(int c){
		
		T = c * 3000;
		System.out.println("���� : " + c + "��" + T + "���Դϴ�.");
		
	}
	
	
}


public class pratice06 extends cut{
	
 

	
	public static void main(String[] args) {
 		
		cut c = new cut();
		c.D(2);
		c.S(8);
		c.T(1);
		
		System.out.println("�հ� : "+ (c.D+c.S+c.T) + "��");
		
		}

}
