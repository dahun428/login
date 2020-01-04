package CalculatorPrint;

class Multi extends Calculator{

	public void multicalculator(){
		System.out.println(this.left * this.right);
	}
	
}


public class CalculatorMulti {

	public static void main(String[] args) {

		Multi c1 = new Multi();
		c1.setOprands(40, 50);
		c1.sum();
		c1.avg();
		c1.multicalculator();
		
		
	}

}
