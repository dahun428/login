package cloudstudying;

public class pratice74 {
	  public static void main(String[] args) {
	    // ��ü ����
	    Square_ s = new Square_();
	    s.length = Integer.parseInt(args[0]);
	    s.color1 = args[1];
	    // ���
	    System.out.printf("���簢���� ����: %d\n", s.getArea());
	    System.out.printf("���簢���� ����: %s\n", s.getColor());
	  }
	}
	class Square_ {

	int length;
	int area;
	String color1;
	
	public int length() {
		return length;
	}
	public int getArea() {
		return length * length;
	}
	public String getColor() {
		return color1;
	}
	
	}