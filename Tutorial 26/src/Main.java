
public class Main implements Dog {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		// 클래스 (Main) 객체변수(main) = new(메모리 할당 인스턴스 생성, 참조값 리턴 ->객체) 클래스(); (-> 생성자호출)
	}

	@Override
	public void crying() {

		System.out.println("월월");
		
	}

	@Override
	public void show() {
		
		System.out.println("hello world");
		
	}

}
