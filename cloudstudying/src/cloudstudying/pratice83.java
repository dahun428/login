package cloudstudying;

public class pratice83 {

	
	public static void main(String[] args) {
		
		Studentss a = new Studentss("Tom");
		Studentss b = new Studentss("Jong");
		Studentss c = new Studentss("Jung");
		
		System.out.printf("전체 학생수 : %d", Studentss.id);
	}

}
class Studentss{
	
	static int id;
	String name;
	static int count = 0;
	
	Studentss(String name){
		
		count++;
		id = count;
		this.name=name;
	}
}
