package cloudstudying;


class title{
	
	String product = " ǰ��  : ";
	String priceCard = " ���� : ";
	String Pn;
	int price;
	
	
	//�ѿ� �ɵ�� = 112500
	//���� ������ = 25500
	// �ƽ��� ���� = 5000
	
	public void Card(String Pn,int price){
		
		this.Pn = Pn;
		this.price = price;

		System.out.println(product + Pn + priceCard + price);
		
	}
	
	
		
}
public class pratice02 extends title{
	
	
	
	public static void main(String[] args) {
		
		title t = new title();
		t.Card("�ѿ� �ɵ��", 112500);
		t.Card("��ġ������", 25500);
		t.Card("�ƽ�������", 5000);
		
		

		String item1 = "�ѿ� �ɵ��";
		String item2 = "��ġ������";
		String item3 = "�ƽ�������";
		
		int price1 = 112500;
		int price2 = 22500;
		int price3 = 5000;
		
		System.out.printf("ǰ�� : %-10s ���� : %+8d\n", item1, price1);
		System.out.printf("ǰ�� : %-10s ���� : %+8d\n", item2, price2);
		System.out.printf("ǰ�� : %-10s ���� : %+8d\n", item3, price3);

		
		
	
		

		
	}

}
