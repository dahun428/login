package cloudstuding02;

public class pratice03 {

	public static void main(String[] args) {
		
		bread P = new bread("��", 600);
		bread Y = new bread("��ä", 700);
		bread J = new bread("����", 900);
		
		
		 //System.out.printf("%s ȣ�� : %d ��\n", P.name, P.price);
		 //System.out.printf("%s ȣ�� : %d ��\n", Y.name, Y.price);
		 //System.out.printf("%s ȣ�� : %d ��", J.name, J.price);
		System.out.println(P.bread_info());
		System.out.println(Y.bread_info());
		System.out.println(J.bread_info());
		
	}

}

class bread{
	
	String name;
	int price;
	
	bread(String name , int price) {
		this.name = name;
		this.price = price;
		
	}
	public String bread_info() {
		return String.format("%s ȣ�� : %d ��", name, price);
	
	}
	
	
}
