package cloudstudying;

public class pratice68 {
	  public static void main(String[] args) {
	    // �� ����� ��ü ����
	    CatA cat1 = new CatA();
	    CatA cat2 = new CatA();
	    
	    // ��ü �ʵ� �ʱ�ȭ
	    cat1.name = "�׷�";
	    cat2.name = "����";
	    
	    // �� ������� �߿�~
	    cat1.meow(cat1.name);
	    cat2.meow(cat2.name);
	    
	    // �� ������� ������!
	    cat1.claw(cat1.name);
	    cat2.claw(cat2.name);
	  }
	}

	/* ����� Ŭ���� */
	class CatA {
	  /* �ʵ�(����) ���� */
	  String name;    // �̸�
	  String breeds;  // ǰ��
	  int age;        // ����
	   
	  
	  /* �޼ҵ�(����) ���� */
	  void meow(String name) {
		  this.name = name;
		   System.out.printf("[%s]�� �߿�~\n", name);
	  }
	  
	  void claw(String name) {
		  this.name = name;
	    /* 1. claw �޼ҵ带 �ϼ��Ͻÿ�. */
	    System.out.printf("[%s]�� ������! ����~", name);
	  }
	}