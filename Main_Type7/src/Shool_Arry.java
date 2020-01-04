
public class Shool_Arry {

	
	public static void main(String[] args) {
		
		int korea1 = 80;
		
		
		
		String a = "국어";
		String b = "수학";
		String c = "영어";
		String d = "한국사";
		
				
		String []  = { a, b, c, d} ;
		int m = 5;
		String [][] SchoolTable = new String[n][m];
		
		
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				
				if( i == 0)
				{
				
				SchoolTable[i][0] = String.valueOf("과목성적");
				SchoolTable[i][1] = " 국 어 " ;
				SchoolTable[i][2] = " 수 학 " ;
				SchoolTable[i][3] = " 영 어 ";
				SchoolTable[i][4] = " 한국사 ";
				
				if ( j == 0 )
				

					SchoolTable[1][j] = " 최유진 ";
					SchoolTable[2][j] = " 정다훈 ";
					SchoolTable[3][j] = " 이순신 ";
					SchoolTable[4][j] = " 한복함 ";
					
				


				SchoolTable[i][1] = Integer.toString(korea1);
				SchoolTable[i][2] = Integer.toString(korea1);
				SchoolTable[i][3] = Integer.toString(korea1);
				SchoolTable[i][4] = Integer.toString(korea1);
				
				}
				
				SchoolTable[2][1] = Integer.toString(korea1);
				SchoolTable[2][2] = Integer.toString(korea1);
				SchoolTable[2][3] = Integer.toString(korea1);
				SchoolTable[2][4] = Integer.toString(korea1);
				
				SchoolTable[3][1] = Integer.toString(korea1);
				SchoolTable[3][2] = Integer.toString(korea1);
				SchoolTable[3][3] = Integer.toString(korea1);
				SchoolTable[3][4] = Integer.toString(korea1);
				
				SchoolTable[4][1] = Integer.toString(korea1);
				SchoolTable[4][2] = Integer.toString(korea1);
				SchoolTable[4][3] = Integer.toString(korea1);
				SchoolTable[4][4] = Integer.toString(korea1);
				
			
			
			}
					
				
			}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				System.out.print(SchoolTable[i][j] + " ");
			}
			
			System.out.println();
							}		
		
}
}
