package cloudstudying;

public class pratice59 {

	public static void main(String[] args) {

		String t = "Happy New Year, Brother!";
		int [] result_  = count(t);
		
				
		System.out.printf("%s \n���� : %d�� , ���� : %d�� , �׿� : %d��.",t , result_[0],result_[1],result_[2]);
	}
	public static int [] count(String str) {
		
		int A = 0; //����
		int B = 0; //����
		int C = 0; //�ĸ�, ����ǥ, ��ĭ ��
		
		char [] ch = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			switch(ch[i]) {
			
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e':
			case 'A':
			case 'I':
			case 'O':
			case 'U':
			case 'E':
				B++;
				break;
			case '.':
			case ',':
			case '!':
			case ' ':
				C++;
				break;
			default:
				A++;
				break;
			
			}
		}
		
		
		return new int[] {A , B , C};
		
		
	}

}
