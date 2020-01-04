
public class pratice_2 {

	final double inchToCm = 2.54;
	static int inch ;
	
	public double cm(int inch) {
		
		pratice_2.inch = inch;
		return inch * inchToCm;
		
	}
	
	public static void main(String[] args) {
		
	
		int inch = 32;
	   
	
	   pratice_2 p = new pratice_2();
	   p.cm(inch);
	   System.out.println(inch + "인치는  " + p.cm(inch) + " cm 입니다.");
		
	}
}
