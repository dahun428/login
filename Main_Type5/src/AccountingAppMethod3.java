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

	    String price = JOptionPane.showInputDialog(frame, "금일의 판매수익은 얼마 입니까?");

	    System.out.printf("금일의 판매 수익은 다음과 같습니다.", price);
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
		 
				 
		 System.out.println("배당금  " + " 업자  "+ (i + 1) + "명 : " + (getIncome() * dividendRates[i]));
	 }	

	 
 }
 
 private static void print(){
	 
		
	 
		System.out.println("판매금액 : " + valueOfSupply);
		System.out.println("부가세   : " + getVat());
		System.out.println("총 금액  : " + getTotal());
		System.out.println("비용      : " + getExpense());
		System.out.println("수익      : " + getIncome());
	
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
