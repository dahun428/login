package cloudstudying;

public class pratice76 {
	  public static void main(String[] args) {
	    // ��ü ���� �� �ʱ�ȭ
	    Bicycle_ b1 = new Bicycle_("�θ�2", 21.74, 899000);
	    Bicycle_ b2 = new Bicycle_("�ž�2", 12.57, 495000);
	    // ��ü ���� ���
	    System.out.printf("Bicycle { %s, %.2fkg, %d�� }\n", b1.name, b1.weight, b1.price);
	    System.out.printf("Bicycle { %s, %.2fkg, %d�� }\n", b2.name, b2.weight, b2.price);
	  }	
	}

	class Bicycle_{
	  // �ʵ�
	  String name;
	  double weight;
	  int price;
	  
	  // ������ - �Ķ���͸� ���� �ʱ�ȭ
	  Bicycle_(String n, double w, int p) {
	    name = n;
	    weight = w;
	    price = p;
	  }
	}