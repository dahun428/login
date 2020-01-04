package cloudstudying;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	
}*/

/*class Company{
	public static final Fruit GOOGLE = new Fruit();
	public static final Fruit APPLE = new Fruit();
	public static final Fruit ORACLE = new Fruit();
}*/

enum Fruit{
	APPLE , PEACH, BANANA
	}
enum Company{
	GOOGLE, APPLE, ORACLE
}

public class pratice45 {

	 
	public static void main(String[] args) {
		 
 
		Fruit type = Fruit.APPLE;
		switch(type) {
			case  APPLE :
				System.out.println(57);
				break;
			case  PEACH :
				System.out.println(34);
				break;
			case  BANANA :
				System.out.println(93);
				break;
		}
		
		
	}

}
