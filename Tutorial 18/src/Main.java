
public class Main {

	public static void main(String[] args) {

		int n = 50;
		int[][] array = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				array[i][j] = (int)(Math.random() * 10);
				
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println();
		
			
		}
		
		
	}

}
