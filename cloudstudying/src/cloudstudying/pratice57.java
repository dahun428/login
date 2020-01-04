package cloudstudying;

public class pratice57 {

	public static void main(String[] args) {

		int [] A = { 0,2,4,6,8};
		int [] B = { 1,3,5,7,9};
		
		// 두개의 배열값 합치기
		
		int [] result = merged(A,B); 
		
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d" , result[i]);
		}
		
	}
	
	public static int[] merged(int []arr1 , int [] arr2) {
		int[] mergedarr = new int [arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			mergedarr [2*i] = arr1[i];
			mergedarr [2*i+1] = arr2[i];
		}
		return mergedarr;
	}

}
