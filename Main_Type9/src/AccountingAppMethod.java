class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	 double vat = getVAT();
	 double total = getTotal();
	 double expense = getExpense();
	 double income = getIncome();
	 double dividend1 = getDividend1();
	 double dividend2 = getDividend2();
	 double dividend3 = getDividend3();
	 
	 static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1() );
		System.out.println("Dividend 2 : " + getDividend2() );
		System.out.println("Dividend 3 : " + getDividend3() );
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private  static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static  double getVAT() {
		return valueOfSupply*vatRate;
	}
	
		
}
public class AccountingAppMethod {

 
public static void main(String[] args) {
	 
	 
	 Accounting.valueOfSupply = 10000.0;
	 Accounting.vatRate = 0.1;
	 Accounting.expenseRate = 0.3;
	 Accounting.print();
	 	 
	 Accounting a1 = new Accounting();
	 a1.valueOfSupply = 10000.0;
	 a1.vatRate = 0.1;
	 a1.expenseRate = 0.3;
	 
	 Accounting a2 = new Accounting();
	 a2.valueOfSupply = 20000.0;
	 a2.vatRate = 0.05;
	 a2.expenseRate = 0.3;
	 a2.print();
	 
	 
 }

}