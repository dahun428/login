import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("전사  : 1 , 궁수 : 2, 마법사 : 3 ?");
		int input = scanner.nextInt();
		myclass cls;
		
		
		
		if(input == 1) {
			cls = new Worrior();
			cls.show();
			
			
		}
		else if(input == 2) {
			cls = new Acher();
			cls.show();
			
		}
		else if(input == 3) {
			cls = new Magician();
			cls.show();
			
		}
	}

}
