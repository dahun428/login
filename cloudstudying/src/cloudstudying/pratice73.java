package cloudstudying;

public class pratice73 {
	  public static void main(String[] args){
	    Dog_ dog1=new Dog_(); 
	    dog1.setName("��ġ"); 
	    dog1.setAge(4);     
	    dog1.print();
	  }
	}
	class Dog_{
	  String name;  
	  int age;   
	  void setName(String n){
	    name = n;
	  }
	  void setAge(int a){
	    age = a;
	  }
	  void print() {
	    System.out.printf("���δ�! ���� %s�̱�, %d���̿���.\n", name, age);
	  }
	}