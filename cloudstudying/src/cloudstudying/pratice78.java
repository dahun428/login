package cloudstudying;

public class pratice78 {

	public static void main(String[] args) {
		
		Goroke pizza = new Goroke("피자", 1000);
		Goroke vegetable = new Goroke("야채", 800);
		Goroke pat = new Goroke("팥", 500);
		
		System.out.println(pizza.str(pizza.name, pizza.price));
		System.out.println(vegetable.str(vegetable.name, vegetable.price));
		System.out.println(pat.str(pat.name, pat.price));
		
	}

}
class Goroke{
	
	String name;
	int price;

	Goroke(String n , int p){
	
	name = n;
	price = p;
	}
	String str(String name, int price) {
		
		return String.format("Goroke{%s , %d 원}", name , price);
	}
}
