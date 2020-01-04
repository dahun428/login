
public class Main {
		
	
	
	public static void main(String[] args) {
	

		String a = "woman";
		int b = 2;
		
		//자바는 string 을 비교할 때 equals()를 이용한다.
		
		if(a.equalsIgnoreCase("man") && b==0)
		{
			System.out.println("남자입니다." + "0 입니다.");
			
		}
		else if(a.equalsIgnoreCase("man") && !(b==0))
				{
			System.out.println("남자압니다." + "0이 아닙니다.");
			
				}
		else if(!a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("남자가 아닙니다." + "0입니다.");
		}
		else
		{
			System.out.println("남자가아닙니다." + "0이 아닙니다.");
		
		}
	
	}
	
}