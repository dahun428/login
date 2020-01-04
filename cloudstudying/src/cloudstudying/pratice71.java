package cloudstudying;

public class pratice71 {

	public static void main(String[] args) {
 
		Hero h1 = new Hero();
		h1.name = "쥬리오";
		h1.hp = 100;
		h1.punch();
	}

}

class Hero{
	String name;
	int hp;
	
	void punch() {
		System.out.println(name + "의 펀치!");
		int A = hp - 1;
		System.out.printf(" %s 의 생명력이  %d 남았습니다.", name , A);
		
	}
}
