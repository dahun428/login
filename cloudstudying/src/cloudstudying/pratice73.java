package cloudstudying;

public class pratice73 {
	  public static void main(String[] args){
	    Dog_ dog1=new Dog_(); 
	    dog1.setName("망치"); 
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
	    System.out.printf("주인님! 저는 %s이구, %d살이에요.\n", name, age);
	  }
	}