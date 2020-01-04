
public class Worrior extends myclass{

	public Worrior() {
	
	name = "전사";
	dex = 7;
	intellic = 3;
	str = 10;
	luck = 4;
	}
	public void show() {
		System.out.println("전사를 고르셨습니다. " + name);
		System.out.println("스텟은 다음과 같습니다.");
		System.out.println(" 힘 : " + str);
		System.out.println(" 민첩 : " + dex);
		System.out.println(" 지능 : " + intellic);
		System.out.println("운 : " + luck);
		
	}
	
}
