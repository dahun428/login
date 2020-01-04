package cloudstudying;


class title{
	
	String product = " Ç°¸í  : ";
	String priceCard = " °¡°Ý : ";
	String Pn;
	int price;
	
	
	//ÇÑ¿ì ²Éµî½É = 112500
	//ÂüÁö ¼±¹°ÆÑ = 25500
	// ¸Æ½ººÀ ÇÑÆÑ = 5000
	
	public void Card(String Pn,int price){
		
		this.Pn = Pn;
		this.price = price;

		System.out.println(product + Pn + priceCard + price);
		
	}
	
	
		
}
public class pratice02 extends title{
	
	
	
	public static void main(String[] args) {
		
		title t = new title();
		t.Card("ÇÑ¿ì ²Éµî½É", 112500);
		t.Card("ÂüÄ¡¼±¹°ÆÑ", 25500);
		t.Card("¸Æ½ººÀÇÑÆÑ", 5000);
		
		

		String item1 = "ÇÑ¿ì ²Éµî½É";
		String item2 = "ÂüÄ¡¼±¹°ÆÑ";
		String item3 = "¸Æ½ººÀÇÑÆÑ";
		
		int price1 = 112500;
		int price2 = 22500;
		int price3 = 5000;
		
		System.out.printf("Ç°¸í : %-10s °¡°Ý : %+8d\n", item1, price1);
		System.out.printf("Ç°¸í : %-10s °¡°Ý : %+8d\n", item2, price2);
		System.out.printf("Ç°¸í : %-10s °¡°Ý : %+8d\n", item3, price3);

		
		
	
		

		
	}

}
