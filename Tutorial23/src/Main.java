import java.util.Scanner;

public class Main {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	System.out.println(" 총 몇명의 학생이 있습니까? : ");
	int number = sc.nextInt();
	Student[] students = new Student[number];
	
	for(int i = 0; i < number; i++) {
		
		String name;
		int age;
		int height;
		int weight;
		String studentID;
		int grade;
		double GPA;
		
		
		System.out.print( " 이름 : ");
		name = sc.next();
		System.out.print(" 나이 : ");
		age = sc.nextInt();
		System.out.print(" 키 : ");
		height = sc.nextInt();
		System.out.print(" 몸무게 : ");
		weight = sc.nextInt();
		System.out.print("학번 : ");
		studentID = sc.next();
		System.out.print( " 학년 : ");
		grade = sc.nextInt();
		System.out.print(" 학점 : ");
		GPA = sc.nextDouble();
		
		students[i] = new Student(name, age, height, weight, studentID, grade, GPA);
		
		

	
}
	
	for(int i = 0; i < number; i++) {
		students[i].show();
		
	}

	}

}
