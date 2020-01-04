package cloudstudying;

public class pratice79 {

	public static void main(String[] args) {
	
	
		Hero_79 Ironman = new Hero_79();
		Hero_79 Thanos = new Hero_79();
		Hero_79 Thor = new Hero_79();
		Hero_79 Grute = new Hero_79();
		
		Ironman.Hero_("아이언맨", 80);
		Thanos.Hero_("타노스", 160);
		Thor.Hero_("토르", 150);
		Grute.Hero_("그루트", 40);
		
		System.out.println(Ironman.str());
		System.out.println(Thanos.str());
		System.out.println(Thor.str());
		System.out.println(Grute.str());
		
	}

}
class Hero_79{
	
	String name;
	int hp;
	
	public void Hero_(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	String str() {
		return String.format("Hero { name : %s, hp : %d}", name , hp);
	}
	
	
}
