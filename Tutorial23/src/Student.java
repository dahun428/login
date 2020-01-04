
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
		System.out.print( " 학생 이름 : " + getName());
		System.out.print( " 학생 나이 : " + getAge());
		System.out.print( " 학생 키    : " + getHeight());
		System.out.print( " 학생 몸무게 : " + getWeight());
		System.out.print( " 학번   :  " + getStudentID()) ;
		System.out.print(" 학년 :  " + getGrade());
		System.out.print( " 학점 : " + getGPA());
	}
	
	
}
