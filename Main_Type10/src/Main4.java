

class C1{
	
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
		//system.out.println(instance_variable);
	}
	void instance_staic() {
		//인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
	
}

public class Main4 {

	public static void main(String[] args) {

		C1 c = new C1();
		c.static_static();
		//인스턴스를 이용해서 정적 메소드에 접근
		//인스턴스 메소드가 정적 변수에 접근
		c.static_instance();
		//인스턴스를 이용해서 정적 메소드에 접근
		//정적 메소드가 인스턴스 변수에 접근 ->실패
		c.instance_staic();
		//인스턴스를 이용해서 인스턴스 메소드에 접근
		//인스턴스 메소드가 인스턴스 변수에 접근
		c.instance_instance();
		//클래스를 이용해서 클래스 메소드에 접근
		//클래스 메소드가 클래스 변수에 접근
		c1.static_static();
		//클래스를 이용해서 클래스 메소드에 접근
		//클래스 메소드가 인스턴스 변수에 접근 _>실패
		c1.static_instance();
		//클래스를 이용해서 인스턴스 메소드에 접근 ->실패
		//클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
	}

}
