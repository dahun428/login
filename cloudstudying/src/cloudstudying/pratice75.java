package cloudstudying;

public class pratice75 {
	  public static void main(String[] args) {
	    // °´Ã¼ »ı¼º
	    Cylinder c = new Cylinder();
	    // ¼Ó¼º °ª ÀÔ·Â
	    c.radius = 4;
	    c.height = 5;
	    // Ãâ·Â
	    System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ: %.2f\n", c.getVolume());
	    System.out.printf("¿ø±âµÕÀÇ °Ñ³ĞÀÌ: %.2f\n", c.getArea());
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