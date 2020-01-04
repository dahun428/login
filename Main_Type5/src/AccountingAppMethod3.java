import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class AccountingAppMethod3 {

 public static double valueOfSupply;
 public static double vatRate;
 public static double expenseRate;

 public static void main(String[] args) {


	    JFrame frame = new JFrame("InputDialog Example #1");

	    String price = JOptionPane.showInputDialog(frame, "������ �Ǹż����� �� �Դϱ�?");

	    System.out.printf("������ �Ǹ� ������ ������ �����ϴ�.", price);
	    System.out.println( " ");
	    System.out.println("--------------");


	 
	 valueOfSupply = Double.parseDouble(price);
	 vatRate = 0.1;
	 expenseRate = 0.3;
	 
	 
	 print();
	 
	 double [] dividendRates = new double [3];
	 dividendRates[0] = 0.5;
	 dividendRates[1] = 0.3;
	 dividendRates[2] = 0.2;
	 
	 
	 for(int i = 0; i < dividendRates.length; i++) {
		 
				 
		 System.out.println("����  " + " ����  "+ (i + 1) + "�� : " + (getIncome() * dividendRates[i]));
	 }	

	 
 }
 
 private static void print(){
	 
		
	 
		System.out.println("�Ǹűݾ� : " + valueOfSupply);
		System.out.println("�ΰ���   : " + getVat());
		System.out.println("�� �ݾ�  : " + getTotal());
		System.out.println("���      : " + getExpense());
		System.out.println("����      : " + getIncome());
	
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
