package cloudstudying;

import java.util.Arrays;

public class pratice51 {

	public static void main(String[] args) {
 
		double [][] towDimArray = {
				{92,86},{76,96},{88,72}
		};
		double sum = 0;
		for (int person = 0; person < towDimArray.length; person ++) {
			for(int j = 0; j < towDimArray[person].length; j++) {
				
				sum += towDimArray[person][j];
				
			}
		}
		
		int row = towDimArray.length;
		int col = towDimArray[0].length;
		System.out.printf("ЦђБе : %.2f\n", sum / (row * col));
		System.out.println(Arrays.deepToString(towDimArray));
		System.out.println(row);
		System.out.println(col);
		System.out.println(sum);		
		
	}

}
