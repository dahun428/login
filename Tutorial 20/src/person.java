
public class person {

	
	private String menu;
	private int age;
	private int height;
	private int weight;
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public person(String menu, int age, int height, int weight) {
		super();
		this.menu = menu;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
