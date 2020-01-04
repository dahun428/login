package cloudstudying;

class cut{
	
	int D,S,T;
	int a,b,c;
	public void D(int a){
		
		D = a * 2500;
		System.out.println("떡볶이 : " + a + "개" + D + "원입니다.");
		
	}
	public void S(int b){
		
		S = b * 700;
		System.out.println("튀김 : " + b + "개" + S + "원입니다.");
		
	}

	public void T(int c){
		
		T = c * 3000;
		System.out.println("순대 : " + c + "개" + T + "원입니다.");
		
	}
	
	
}


public class pratice06 extends cut{
	
 

	
	public static void main(String[] args) {
 		
		cut c = new cut();
		c.D(2);
		c.S(8);
		c.T(1);
		
		System.out.println("합계 : "+ (c.D+c.S+c.T) + "원");
		
		}

}
