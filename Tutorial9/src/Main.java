
public class Main {
		
	
	
	public static void main(String[] args) {
	

		String a = "woman";
		int b = 2;
		
		//�ڹٴ� string �� ���� �� equals()�� �̿��Ѵ�.
		
		if(a.equalsIgnoreCase("man") && b==0)
		{
			System.out.println("�����Դϴ�." + "0 �Դϴ�.");
			
		}
		else if(a.equalsIgnoreCase("man") && !(b==0))
				{
			System.out.println("���ھдϴ�." + "0�� �ƴմϴ�.");
			
				}
		else if(!a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("���ڰ� �ƴմϴ�." + "0�Դϴ�.");
		}
		else
		{
			System.out.println("���ڰ��ƴմϴ�." + "0�� �ƴմϴ�.");
		
		}
	
	}
	
}