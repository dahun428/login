
public class Main implements Dog, Cat{

	public static void main(String[] args) {

	
		Main main = new Main();
		main.cryingcat();
		main.cryingdog();
		main.one();
		main.two();
		
		
	}

	@Override
	public void cryingcat() {
		
		System.out.println("¾ß¿Ë");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two!");
		
	}

	@Override
	public void cryingdog() {
		// TODO Auto-generated method stub
		System.out.println("¿Ð¿Ð");
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		
		System.out.println("one!");
		
	}

}
