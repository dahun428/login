
public class Main implements Dog {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		// Ŭ���� (Main) ��ü����(main) = new(�޸� �Ҵ� �ν��Ͻ� ����, ������ ���� ->��ü) Ŭ����(); (-> ������ȣ��)
	}

	@Override
	public void crying() {

		System.out.println("����");
		
	}

	@Override
	public void show() {
		
		System.out.println("hello world");
		
	}

}
