package cloudstudying;

public class pratice75 {
	  public static void main(String[] args) {
	    // ��ü ����
	    Cylinder c = new Cylinder();
	    // �Ӽ� �� �Է�
	    c.radius = 4;
	    c.height = 5;
	    // ���
	    System.out.printf("������� ����: %.2f\n", c.getVolume());
	    System.out.printf("������� �ѳ���: %.2f\n", c.getArea());
	  }
	}
	class Cylinder {
		
		final static double PI = 3.14;
		double radius, height;
		double volume, area, round;
		
		public double getVolume() {
			volume = getRound() * height;
			return volume;
		}
		public double getArea() {
			area = 2 * getRound() + getRoundSide() ;
			return area;
		}
		public double getRoundSide() {
			return 2 * PI * radius * height;
		}
		public double getRound() {
			round = PI * radius * radius;
			return round;
		}
		
	}