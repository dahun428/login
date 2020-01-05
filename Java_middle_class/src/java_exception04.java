
public class java_exception04 {

	public static void main(String[] args) {

		C c = new C();
		c.run();
		
		
	}

}
class B{
	void run() {
		
	}
	
	
}
class C{
	void run() {
		B b = new B();
		b.run();
	}
}
