package cloudstudying03;

public class pratice05 {

	public static void main(String[] args) {

		Squre05 s1 = new Squre05();
		s1.squreinfo( 4, "파랑");
	}

}

class Squre05{
	
	int length;
	String color;
	
	public int getArea(int length) {	
		this.length = length;
		return length*length;
		
	}
	public String getColor(String color) {
		this.color = color;
		return color;
	}
	public void squreinfo(int length, String color) {
		this.length = length;
		this.color = color;
		System.out.printf("정사각형의 넓이 : %d\n정사각형의 색상 : %s", getArea(length), getColor(color));
	}
	
}