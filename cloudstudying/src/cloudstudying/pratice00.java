package cloudstudying;

public class pratice00 {

  static String name;
  static String Man;
  static int classnb;
  static double myheight;
	

public static void name(String name) {
	
	System.out.println("�̸� : " + name);
}

public static void classnb(int classnb) {
	
	System.out.println("�й� : " + classnb);
}
public static void myheight(double myheight) {
	System.out.println("���� : " + myheight + "m");
}

public static void mrw(String mrw) {
	if(mrw == Man) {
		System.out.println("�����ΰ��� ?" + "true");
	}
	else {
		System.out.println("�����ΰ��� ?" + "false");
	}
}
	public static void main(String[] args) {
	
		pratice00.name("������");
		pratice00.classnb(201013039);
		pratice00.myheight(1.78);
		pratice00.mrw(Man);
		
		
		
		
	}

}
