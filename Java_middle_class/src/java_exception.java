
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
//			throw new IllegalArgumentException("�ι�°�� 0�� ������� �ʽ��ϴ�.");
//		}
		
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		
		if(right == 0) {
			throw new ArithmeticException("0���� ���� �� �����ϴ�.");
		}
		
		try {
			System.out.println("������� " + (this.left/this.right) +"�Դϴ�.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n " + e.getMessage());
			System.out.println("\n\ne.toString()\n " + e.toString());
			System.out.println("\n\ne.printstacktrace()\n ");
			e.printStackTrace();
		}
		
	}
	
}
