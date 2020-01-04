package CalculatorPrint;

class Dividend extends Multi{
	public void divid() {
		
		System.out.println((this.left / this.right));
		
	}
}

public class CalculatorDividend {

	public static void main(String[] args) {

		Dividend c1 = new Dividend();
		c1.setOprands(10, 10);
		c1.sum();
		c1.avg();
		c1.multicalculator();
		c1.divid();
		
		
	}

}
