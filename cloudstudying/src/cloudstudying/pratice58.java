package cloudstudying;

public class pratice58 {

	public static void main(String[] args) {
 
		String s = "Programming is Fun, Right?";
		int [] result = count(s);
		
		System.out.printf("%s\n=> ���� %d��, ���� %d��, ��Ÿ %d��", s, result[0], result[1], result[2]);
				
		
	}
	public static int [] count(String str) {
		int conso = 0; //����
		int vowel = 0; //����
		int leve = 0; //����ǥ��
		
		char[] characters =  str.toCharArray();
		
		for ( int i = 0; i < characters.length; i++) {
			switch (characters[i]) {
			//����
			case 'a':
			case 'o':
			case 'e':
			case 'i':
			case 'u':
				vowel++;
				break;
			case ' ': // �����̽�
			case '\t':// ��
			case '\n':// ����
			case ',': // �޸�
			case '.': // ��
			case '!': // ����ǥ
			case '?': //����ǥ
				leve++;
				break;		
						
			//�׿� (����)
			default :
			 conso++;
			 break;
			 
			}
			
		}
	return new int[] {conso, vowel, leve};
	}
	

}
