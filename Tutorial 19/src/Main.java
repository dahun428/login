
public class Main {

	public static void main(String[] args) {

		// Ŭ���� = �ϳ��� Ʈ�� = ���� // �ν��Ͻ�ȭ : ������ �������. Ŭ�������� ������� ������ ����� �� �ִ� ����.
		
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node result = one.getCenter(two);
		System.out.println(" x : " + result.getx() + ", y : " + result.gety());
		
		
	}

}