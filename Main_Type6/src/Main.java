
public class Main {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = args[0];
		double vATRate = 0.1;
		double vAT = valueOfSupply * vATRate;
		double total = valueOfSupply + vAT;
		double expenseRate = 0.3;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		
		System.out.println("공급가 : " + valueOfSupply);
		System.out.println("부가세 : " + vAT);
		System.out.println("총금액 : " + total);
		System.out.println("비용   : " + expense);
		System.out.println("수익   : " + income);
		System.out.println("배당1: " + dividend1);
		System.out.println("배당1: " + dividend2);
		System.out.println("배당1: " + dividend3);
		
		
		
	// 공급가 / 텍스 / 토탈 / 비용 / 이익 / 배당 123
		
	}

}
