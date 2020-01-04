package cloudstudying;

public class pratice80 {
	  public static void main(String[] args) {
	    // 디폴트 생성자로 객체 만들기
	    Drink d1 = new Drink();
	    d1.name = "포카리";
	    d1.price = 1000;
	    
	    // 다른 생성자로 객체 만들기
	    Drink d2 = new Drink( );
	    d2.name = "박카스";
	    d2.price = 800;
	    
	    // 모든 객체 출력
	    System.out.println(d1.toStr());
	    System.out.println(d2.toStr());
	  }
	}

	// 드링크 객체
	class Drink {
	  // 필드
	  String name;
	  int price;
	  
	  /* 1. 디폴트 생성자를 추가하세요. */
	  
	  
	  // 생성자
	  Drink() {
		  
	  }
	  
	  // 메소드
	  String toStr() {
	    return String.format("Drink { name: %s, price: %d }", name, price);
	  }
	}