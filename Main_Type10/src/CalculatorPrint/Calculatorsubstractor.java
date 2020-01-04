package CalculatorPrint;

class substract extends Calculator{

public void substractor() {
	
	System.out.println(this.left - this.right);
	
}
}

public class Calculatorsubstractor{

	
	
	
	public static void main(String[] args) {

		substract c1 = new substract();
		c1.setOprands(20, 30);
		c1.sum();
		c1.avg();
		c1.substractor();
	
		
	}

}
