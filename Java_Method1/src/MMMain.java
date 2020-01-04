
public class MMMain {

	private static double valueOfSupply;
	private static double vatRate;
	private static double vat;
	private static double total;

	public static void main(String[] args){
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVat());
		System.out.println("Total : " + getTotal());
		
		
	}

	public static double getTotal() {
		return valueOfSupply + getVat();
	}

	public static double getVat() {
		return valueOfSupply * vatRate;
	}

}
