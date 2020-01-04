package cloudstudying;

public class pratice68 {
	  public static void main(String[] args) {
	    // 두 고양이 객체 생성
	    CatA cat1 = new CatA();
	    CatA cat2 = new CatA();
	    
	    // 객체 필드 초기화
	    cat1.name = "네로";
	    cat2.name = "나비";
	    
	    // 두 고양이의 야옹~
	    cat1.meow(cat1.name);
	    cat2.meow(cat2.name);
	    
	    // 두 고양이의 할퀴기!
	    cat1.claw(cat1.name);
	    cat2.claw(cat2.name);
	  }
	}

	/* 고양이 클래스 */
	class CatA {
	  /* 필드(상태) 영역 */
	  String name;    // 이름
	  String breeds;  // 품종
	  int age;        // 나이
	   
	  
	  /* 메소드(동작) 영역 */
	  void meow(String name) {
		  this.name = name;
		   System.out.printf("[%s]의 야옹~\n", name);
	  }
	  
	  void claw(String name) {
		  this.name = name;
	    /* 1. claw 메소드를 완성하시오. */
	    System.out.printf("[%s]의 할퀴기! 샥샥~", name);
	  }
	}