


public class pratice_1 {

	int math, sc, eng;
	
	
	public void Math(int math) {
		
		this.math = math;
		System.out.println(" 수학 : " + math);
	}
	public void Science(int sc) {
		
		this.sc = sc;
		System.out.println("과학 : " + sc);
	}
	public void Eng(int eng) {
		
		this.eng = eng;
		System.out.println(" 영어 : " + eng);
	}

	public static void main(String[] args) {
	
		pratice_1 p = new pratice_1();
		p.Math(96);
		p.Science(88);
		p.Eng(76);
		
		
		
	}

}
