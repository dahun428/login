
public class java_exception {
	
	public static void main(String[] args) {

		
		calculator c1 = new calculator();
		c1.setOprands(10, 0);
		
		try {
			c1.divide();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}

class calculator{
	
	int left,right;
	
	public void setOprands(int left, int right) {
		
//		if(right == 0) {
//			throw new IllegalArgumentException("두번째는 0을 허용하지 않습니다.");
//		}
		
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		
		try {
			System.out.println("계산결과는 " + (this.left/this.right) +"입니다.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n " + e.getMessage());
			System.out.println("\n\ne.toString()\n " + e.toString());
			System.out.println("\n\ne.printstacktrace()\n ");
			e.printStackTrace();
		}
		
	}
	
}
