
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
		
		
		System.out.println("���ް� : " + valueOfSupply);
		System.out.println("�ΰ��� : " + vAT);
		System.out.println("�ѱݾ� : " + total);
		System.out.println("���   : " + expense);
		System.out.println("����   : " + income);
		System.out.println("���1: " + dividend1);
		System.out.println("���1: " + dividend2);
		System.out.println("���1: " + dividend3);
		
		
		
	// ���ް� / �ؽ� / ��Ż / ��� / ���� / ��� 123
		
	}

}
