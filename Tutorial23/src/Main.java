import java.util.Scanner;

public class Main {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	System.out.println(" �� ����� �л��� �ֽ��ϱ�? : ");
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
		
		
		System.out.print( " �̸� : ");
		name = sc.next();
		System.out.print(" ���� : ");
		age = sc.nextInt();
		System.out.print(" Ű : ");
		height = sc.nextInt();
		System.out.print(" ������ : ");
		weight = sc.nextInt();
		System.out.print("�й� : ");
		studentID = sc.next();
		System.out.print( " �г� : ");
		grade = sc.nextInt();
		System.out.print(" ���� : ");
		GPA = sc.nextDouble();
		
		students[i] = new Student(name, age, height, weight, studentID, grade, GPA);
		
		

	
}
	
	for(int i = 0; i < number; i++) {
		students[i].show();
		
	}

	}

}
