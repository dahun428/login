import java.io.IOException;

public class java_exception05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class E{
	
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOException() throws IOException {
		throw new IOException();
	}
	void throwIOException1() {
		
		try {
			throw new IOException();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}