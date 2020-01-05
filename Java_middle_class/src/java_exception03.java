import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class java_exception03 {

	public static void main(String[] args) {

		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("C:\\Users\\dahun.000\\eclipse-workspace\\Java_middle_class\\src\\lib\\out.txt"));
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		System.out.println(input);
		
	}

}
