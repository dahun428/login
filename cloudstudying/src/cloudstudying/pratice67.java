package cloudstudying;

/* ���� Ŭ���� */
public class pratice67 {
  public static void main(String[] args) {
    // ������ ��ü ����
    Bicycle b1 = new Bicycle();

    // ��ü �ʵ尪 �ʱ�ȭ
    b1.name = "�ε��� ������";
    b1.weight = 7.25;
    b1.price = 326000;

    // ��ü ���� ���
    System.out.printf("b1->{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);

    Bicycle b2 = new Bicycle();
    b2.name = "����� ������";
    b2.weight = 10.68;
    b2.price = 429000;
    
    System.out.printf("b2->{%s, %.2f, %d}\n", b2.name, b2.weight, b2.price);
    /* 1. �� ������ ��ü b2�� �����Ͻÿ�. */
    /* 2. b2 ��ü�� �ʵ带 �ʱ�ȭ�Ͻÿ�. */
    /* 3. b2 ��ü ������ ����Ͻÿ�. */
  }
}

/* ������ Ŭ���� */
class Bicycle {
  /* �ʵ� */
  String name;    // �̸�
  double weight;  // ����
  int price;      // ����

  /* �޼ҵ� */
  void move() {
    System.out.println("�����Ÿ� Ÿ�� �̵��մϴ�.");
  }
  
  void horn() {
    System.out.println("��������! �������Կ�~");
  }
}