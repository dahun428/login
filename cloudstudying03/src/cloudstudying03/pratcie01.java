package cloudstudying03;

public class pratcie01 {

	public static void main(String[] args) {
	    // Dog 객체 생성
	    Dog d = new Dog();
	    d.name = "네로";
	    d.breeds = "페르시안";
	    d.age = "3";
	    	
	    // Dog 객체 필드 값 출력
	    System.out.printf("이름: %s\n", d.name);
	    System.out.printf("품종: %s\n", d.breeds);
	    System.out.printf("나이: %s\n", d.age);
	  }

}

class Dog{
	
	String name;
	String breeds;
	String age;
	
	public void wag() {
		System.out.println("꼬리치기");
		
	}
	public void bark() {
		System.out.println("짖기!");
	}
	
}