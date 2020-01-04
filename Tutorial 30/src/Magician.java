
public class Magician extends myclass{

	public Magician() {
		
		String name = "마법사";
		str = 3;
		dex = 4;
		intellic = 10;
		luck = 5;
		
		
	}
	public void show() {
		System.out.println("마법사를 고르셨습니다. " + name);
		System.out.println("스텟은 다음과 같습니다.");
		System.out.println(" 힘 : " + str);
		System.out.println(" 민첩 : " + dex);
		System.out.println(" 지능 : " + intellic);
		System.out.println("운 : " + luck);
		
	}
}
