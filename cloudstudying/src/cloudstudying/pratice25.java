package cloudstudying;
public class pratice25 {

	public static void main(String[] args) {
	    printAnimal(1986);
	    printAnimal(1990);
	    printAnimal(2000);
	  }

	  private static void printAnimal(int birthYear) {
	    String animal = "";
	    switch (birthYear % 12) {
	      case 0:
	        animal = "������";
	        break;
	      case 1:
	        animal = "��";
	        break;
	      case 2:
	        animal = "��";
	        break;
	      case 3:
	        animal = "����";
	        break;
	      case 4:
	        animal = "��";
	        break;
	      case 5:
	        animal = "��";
	        break;
	      case 6:
	        animal = "ȣ����";
	        break;
	     
	      /* �ش� �޼ҵ带 �ϼ��ϼ���. */
	      
	      default:
	        animal = "ERROR!";
	        break;
	    }
	    System.out.printf("%d�� => %s��\n", birthYear, animal);
	  }
	}