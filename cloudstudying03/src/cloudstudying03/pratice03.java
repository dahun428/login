package cloudstudying03;

public class pratice03 {

	public static void main(String[] args) {
		int n = 4;
		Squre s1 = new Squre();
		s1.areainfo(n);
	}

}
class Squre{
	
	int lenght;
	
	public int area(int lenght) {
		this.lenght = lenght;
		return lenght * lenght;
	}
	public void areainfo(int lenght) { 
		System.out.printf("�� ���� ���̰� %d�� ���簢���� ���� : %d", lenght, 
				area(lenght));
	}
	
}