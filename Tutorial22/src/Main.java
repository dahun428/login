import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println( " �� ����� �л��� �ֽ��ϱ� ? : ");
		int number = sc.nextInt();
		Student [] students = new Student[number];
		for(int i = 0; i < number; i++) {
			
			
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double GPA;
			
			System.out.print(" �л��� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			System.out.print(" �л��� ���̸� �Է��ϼ��� : ");
			age = sc.nextInt();
			System.out.println(" Ű�� �Է��ϼ��� : ");
			height = sc.nextInt();
			System.out.println(" �����Ը� �Է��ϼ��� : ");
			weight = sc.nextInt();
			System.out.println(" �й��� �Է��ϼ��� : ");
			studentID = sc.next();
			System.out.println( " �г��� �Է��ϼ��� : ");
			grade = sc.nextInt();
			System.out.println(" ������ �Է��ϼ��� : ");
			GPA = sc.nextDouble();
			
			students[i] = new Student( name, age, height, weight, studentID, grade, GPA);
			
			
		}
		for(int i = 0; i < number; i++) {
			students[i].show();
			
		}
		

		
		
		
		
	}

}
