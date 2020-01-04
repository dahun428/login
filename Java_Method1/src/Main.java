import java.io.FileWriter;
import java.io.IOException;

public class Main {

		public static void main(String[] args) throws IOException {

			FileWriter a = new FileWriter("out.txt");
			a.write(twoTimes("a","*"));
			a.close();
	
		
	}
		public static String twoTimes(String text, String text2) {
			String out = " ";
			out = out + text2 + "\n";
			out = out + text + "\n";
			out = out + text + "\n";
		return out;
		}
	
		}
		
