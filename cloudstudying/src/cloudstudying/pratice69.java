package cloudstudying;

public class pratice69 {
	  public static void main(String[] args) {
	    // ��ü ����
	    DrinkMachine machine1 = new DrinkMachine();
	    DrinkMachine machine2 = new DrinkMachine();
	    
	    // ���� �̱�
	    machine1.pushButton(0);
	    machine2.pushButton(1);
	    
	    // ���� Ȯ��
	    machine1.printOutput();
	    machine2.printOutput();
	  }
	}

	class DrinkMachine {
	  /* �ʵ� */
	  String output;
	  
	  /* �޼ҵ� */
	  void pushButton(int num) {
	    String[] drinks = {"�ݶ�", "���̴�", "����"};
	    output = drinks[num];
	  }
	  
	  void printOutput() {
	    System.out.println(output);
	  }
	}