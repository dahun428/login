package cloudstudying;

public class pratice71 {

	public static void main(String[] args) {
 
		Hero h1 = new Hero();
		h1.name = "�긮��";
		h1.hp = 100;
		h1.punch();
	}

}

class Hero{
	String name;
	int hp;
	
	void punch() {
		System.out.println(name + "�� ��ġ!");
		int A = hp - 1;
		System.out.printf(" %s �� �������  %d ���ҽ��ϴ�.", name , A);
		
	}
}
