package cloudstudying;

class person {
	
	private String name;
	private int studentID;
	private double height;
	private boolean isMale;

	public person(String name, int studentID, double height, boolean isMale) {
		
		this.name = name;
		this.studentID = studentID;
		this.height = height;
		this.isMale = isMale;
		
	}
	public void showInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentID);
		System.out.println("신장 : " + height + "m");
		System.out.println("남자인가요 ? " + isMale);
		
		
	}
}

public class pratice00_goodex  {

	
	public static void main(String[] args) {

		
		person person = new person("정다훈", 201013039, 1.78, true);
		person.showInfo();

  }
}