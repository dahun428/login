package cloudstudying;

public class pratice80 {
	  public static void main(String[] args) {
	    // ����Ʈ �����ڷ� ��ü �����
	    Drink d1 = new Drink();
	    d1.name = "��ī��";
	    d1.price = 1000;
	    
	    // �ٸ� �����ڷ� ��ü �����
	    Drink d2 = new Drink( );
	    d2.name = "��ī��";
	    d2.price = 800;
	    
	    // ��� ��ü ���
	    System.out.println(d1.toStr());
	    System.out.println(d2.toStr());
	  }
	}

	// �帵ũ ��ü
	class Drink {
	  // �ʵ�
	  String name;
	  int price;
	  
	  /* 1. ����Ʈ �����ڸ� �߰��ϼ���. */
	  
	  
	  // ������
	  Drink() {
		  
	  }
	  
	  // �޼ҵ�
	  String toStr() {
	    return String.format("Drink { name: %s, price: %d }", name, price);
	  }
	}