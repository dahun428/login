package cloudstudying;

public class pratice85 {

	public static void main(String[] args) {

		SmartPhone iPhone = new SmartPhone("¾ÆÀÌÆù", "010-4346-0429");
		System.out.printf("#%d %s\n", SmartPhone.count, iPhone.toString());
		
	}

}
class SmartPhone{
	
	private String name;
	private String number;
	private boolean power;
	
	public static int count = 0;
	
	public SmartPhone(String name, String number) {
		
		count++;
		this.name = name;
		this.number = number;
		
	}
	public String getNumber() {
		return number;
	}
	public boolean togglePower() {
		
		return false;
	}
	public String toString() {
		return String.format("SmartPhone : { name: \"%s\", number : \"%s\", power: %s}", name, number, power);
	}
	
}
