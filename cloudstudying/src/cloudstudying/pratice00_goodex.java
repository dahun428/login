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
		
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + studentID);
		System.out.println("���� : " + height + "m");
		System.out.println("�����ΰ��� ? " + isMale);
		
		
	}
}

public class pratice00_goodex  {

	
	public static void main(String[] args) {

		
		person person = new person("������", 201013039, 1.78, true);
		person.showInfo();

  }
}