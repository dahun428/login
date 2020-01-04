
public class AccountingApp {

 public static double valueOfSupply;
public static double vatRate;
public static double expenseRate;

public static void main(String[] args) {
	 
	 
	 valueOfSupply = Double.parseDouble(args[0]);
	 vatRate = 0.1;
	 expenseRate = 0.3;
	 double vat = getVat();
	 double total = getTotal();
	 double expense = getExpense();
	 double income = getIncome();
	 double dividend1 = getDividend1();
	 double dividend2 = income * 0.3;
	 double dividend3 = income * 0.2;
	 
	System.out.println("Value of supply : " + valueOfSupply);
	System.out.println("VAT : " + vat);
	System.out.println("Total : " + total);
	System.out.println("Expense : " + expense);
	System.out.println("income : " + income);
	System.out.println("Dividend 1 : " + dividend1 );
	System.out.println("Dividend 2 : " + dividend2 );
	System.out.println("Dividend 3 : " + dividend3 );
	 
 }

public static double getDividend1() {
	return getIncome() * 0.5;
}

public static double getIncome() {
	return valueOfSupply - getExpense();
}

public static double getExpense() {
	return valueOfSupply*expenseRate;
}

public static double getTotal() {
	return valueOfSupply + getVat();
}

public static double getVat() {
	return valueOfSupply*vatRate;
}
	
}
