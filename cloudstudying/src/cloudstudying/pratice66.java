package cloudstudying;

/* CatTest Ŭ���� */
public class pratice66 {
  public static void main(String[] args) {
    // Cat ��ü ����
    Cat c = new Cat();
    
    /* 1. ��ü�� �ʵ� ���� �����Ͻÿ�. */
    
    // Dog ��ü �ʵ尪 ���
    System.out.printf("�̸�: %s\n", c.name);
    System.out.printf("ǰ��: %s\n", c.breeds);
    System.out.printf("����: %d\n", c.age);
    c.claw();
    c.meow();
  }
 
}

/* Cat Ŭ���� */
class Cat {
  String name = "�׷�";   // �̸�
  String breeds = "�丣�þ�"; // ǰ��
  int age = 3;       // ����

  void claw() {
    System.out.println("������!!");
  }
  
  void meow() {
    System.out.println("�߿�~");
  }
}