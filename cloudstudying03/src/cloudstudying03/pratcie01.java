package cloudstudying03;

public class pratcie01 {

	public static void main(String[] args) {
	    // Dog ��ü ����
	    Dog d = new Dog();
	    d.name = "�׷�";
	    d.breeds = "�丣�þ�";
	    d.age = "3";
	    	
	    // Dog ��ü �ʵ� �� ���
	    System.out.printf("�̸�: %s\n", d.name);
	    System.out.printf("ǰ��: %s\n", d.breeds);
	    System.out.printf("����: %s\n", d.age);
	  }

}

class Dog{
	
	String name;
	String breeds;
	String age;
	
	public void wag() {
		System.out.println("����ġ��");
		
	}
	public void bark() {
		System.out.println("¢��!");
	}
	
}