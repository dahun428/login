

class C1{
	
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� �� �� ����.
		//system.out.println(instance_variable);
	}
	void instance_staic() {
		//�ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ���� �� �� �ִ�.
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
		//�ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ����
		//�ν��Ͻ� �޼ҵ尡 ���� ������ ����
		c.static_instance();
		//�ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ����
		//���� �޼ҵ尡 �ν��Ͻ� ������ ���� ->����
		c.instance_staic();
		//�ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ����
		//�ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ����
		c.instance_instance();
		//Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ����
		//Ŭ���� �޼ҵ尡 Ŭ���� ������ ����
		c1.static_static();
		//Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ����
		//Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� _>����
		c1.static_instance();
		//Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� ->����
		//Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
	}

}