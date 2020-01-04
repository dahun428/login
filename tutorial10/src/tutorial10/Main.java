package tutorial10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("index.txt");
		try { 
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
				
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���� ������ �߻��Ͽ����ϴ�.");
			
		}
		
		


		
				
		
	}
	
}