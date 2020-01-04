
public class Main {

	public static void main(String[] args) {

		// 클래스 = 하나의 트리 = 공장 // 인스턴스화 : 변수로 만들어진. 클래스에서 만들어진 실제로 사용할 수 있는 단위.
		
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node result = one.getCenter(two);
		System.out.println(" x : " + result.getx() + ", y : " + result.gety());
		
		
	}

}
