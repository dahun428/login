package cloudstudying;

public class pratice00 {

  static String name;
  static String Man;
  static int classnb;
  static double myheight;
	

public static void name(String name) {
	
	System.out.println("이름 : " + name);
}

public static void classnb(int classnb) {
	
	System.out.println("학번 : " + classnb);
}
public static void myheight(double myheight) {
	System.out.println("신장 : " + myheight + "m");
}

public static void mrw(String mrw) {
	if(mrw == Man) {
		System.out.println("남자인가요 ?" + "true");
	}
	else {
		System.out.println("남자인가요 ?" + "false");
	}
}
	public static void main(String[] args) {
	
		pratice00.name("정다훈");
		pratice00.classnb(201013039);
		pratice00.myheight(1.78);
		pratice00.mrw(Man);
		
		
		
		
	}

}
