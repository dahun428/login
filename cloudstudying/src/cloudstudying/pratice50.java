package cloudstudying;

public class pratice50 {

	
	
	public static void main(String[] args) {
   
		String date = new String("2017-12-04");
		
		String dateElements[] = date.split("-");
		// split ���� �̿��ؼ� dateElements [] �迭���� �Է�
		
		System.out.printf("%s�� %s�� %s��\n", dateElements[0], dateElements[1], dateElements[2]);
		// split �迭���� �Էµ� ���� ȣ��
		
		  for(int i = 0 ; i < dateElements.length; i++) { if ( 10 >
		  Integer.parseInt(dateElements[i])&& dateElements[i].contains("0")) {
		  dateElements[i] = dateElements[i].replace("0", "");
		  // contain -> ��� ���ڿ��� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϴ� �Լ�.
		  //  Integer.parseInt  -> ���ڸ� ���ڿ��� ��ȯ��Ű�� �Լ�
		  // dateElements �� String �迭 ���� ���ڿ��� ��ȯ��Ű�� ��. 
		  // replace - > 0 ���� ������ ��ü
		  } }
		 
		System.out.printf("%s. %s. %s.\n",dateElements[0],dateElements[1],dateElements[2]);
		// dateElements �迭 ���� ȣ��.
	}

}
