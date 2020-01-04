
public class Student extends Person{

	String studentID;
	int grade;
	double GPA;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		this.GPA = gPA;
	}
	
	public void show(){
		
		System.out.println("-----------");
		System.out.print( " �л� �̸� : " + getName());
		System.out.print( " �л� ���� : " + getAge());
		System.out.print( " �л� Ű    : " + getHeight());
		System.out.print( " �л� ������ : " + getWeight());
		System.out.print( " �й�   :  " + getStudentID()) ;
		System.out.print(" �г� :  " + getGrade());
		System.out.print( " ���� : " + getGPA());
	}
	
	
}
