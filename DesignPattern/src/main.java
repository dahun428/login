
public class main {

	public static void main(String[] args) {

		GameCharacter ch = new GameCharacter();
	
		ch.attack();
		
		ch.setWeapon(new Knife());
		ch.attack();
		
		ch.setWeapon(new Sword());
		ch.attack();
		
		ch.setWeapon(new Ex());
		ch.attack();
	}

}
