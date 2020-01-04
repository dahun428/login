
public class Acher {

	String name;
	String power;
	
	public Acher(String name, String power) {
		
		this.name = name;
		this.power = power;
		
		
	}
	
	public boolean eqauls(Object obj) {
		Acher temp = (Acher) obj;
		if(name == temp.name && power == temp.power) {
			
			return true;
		
			
		}
		else {
			return false;
			
		}
		
	} 
}
