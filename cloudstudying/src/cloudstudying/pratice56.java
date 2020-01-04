package cloudstudying;

public class pratice56 {
	public static void main(String[] args) {
		// 배열 생성
		/*
		 * int[] evens = { 0, 2, 4, 6, 8 }; int[] odds = { 1, 3, 5, 7, 9 };
		 */
		int[] A = { 0, 2, 4, 6, 8 };
		int[] B = { 1, 3, 5, 7, 9 };

		int[] result_ = merge(A, B);

		// 배열 병합
		/*
		 * int[] result = merge(evens, odds);
		 */
		// 결과 출력
		System.out.printf("결과 : ");/*
									 * System.out.printf("결과: ");
									 */
		/*
		 * for (int i = 0; i < result.length; i++) { System.out.printf("%d ",
		 * result[i]); }
		 */

		for (int i = 0; i < result_.length; i++) {
			System.out.printf("%d", result_[i]);
		}
	}	

	public static int[] merge(int[] arr1, int[] arr2) {
		int[]mergedarr = new int [arr1.length + arr2.length];
		 
		for(int i = 0; i < arr1.length ; i++) {
			mergedarr[2*i] = arr1[i];
			mergedarr[2*i+1] = arr2[i];
		}
		
		return mergedarr;		
	}
	
	// 두 배열을 입력받아, 하나로 된 새 배열을 반환
	/*
	 * public static int[] merge(int[] arr1, int[] arr2) { int[] mergedArr = new
	 * int[arr1.length + arr2.length];
	 * 
	 * for (int i = 0; i < arr1.length; i++) { 규칙성을 파악하여 해당 반복문을 완성하세요 } return
	 * mergedArr; }
	 */
}