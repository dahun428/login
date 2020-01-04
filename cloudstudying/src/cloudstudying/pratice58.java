package cloudstudying;

public class pratice58 {

	public static void main(String[] args) {
 
		String s = "Programming is Fun, Right?";
		int [] result = count(s);
		
		System.out.printf("%s\n=> 자음 %d개, 모음 %d개, 기타 %d개", s, result[0], result[1], result[2]);
				
		
	}
	public static int [] count(String str) {
		int conso = 0; //자음
		int vowel = 0; //모음
		int leve = 0; //느낌표등
		
		char[] characters =  str.toCharArray();
		
		for ( int i = 0; i < characters.length; i++) {
			switch (characters[i]) {
			//모음
			case 'a':
			case 'o':
			case 'e':
			case 'i':
			case 'u':
				vowel++;
				break;
			case ' ': // 스페이스
			case '\t':// 탭
			case '\n':// 엔터
			case ',': // 콤마
			case '.': // 닷
			case '!': // 느낌표
			case '?': //물음표
				leve++;
				break;		
						
			//그외 (자음)
			default :
			 conso++;
			 break;
			 
			}
			
		}
	return new int[] {conso, vowel, leve};
	}
	

}
