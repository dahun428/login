
public class Shool_Arry {

	
	public static void main(String[] args) {
		
		int korea1 = 80;
		
		
		
		String a = "����";
		String b = "����";
		String c = "����";
		String d = "�ѱ���";
		
				
		String []  = { a, b, c, d} ;
		int m = 5;
		String [][] SchoolTable = new String[n][m];
		
		
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				
				if( i == 0)
				{
				
				SchoolTable[i][0] = String.valueOf("������");
				SchoolTable[i][1] = " �� �� " ;
				SchoolTable[i][2] = " �� �� " ;
				SchoolTable[i][3] = " �� �� ";
				SchoolTable[i][4] = " �ѱ��� ";
				
				if ( j == 0 )
				

					SchoolTable[1][j] = " ������ ";
					SchoolTable[2][j] = " ������ ";
					SchoolTable[3][j] = " �̼��� ";
					SchoolTable[4][j] = " �Ѻ��� ";
					
				


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
