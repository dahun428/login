package cloudstudying;

public class pratice56 {
	public static void main(String[] args) {
		// �迭 ����
		/*
		 * int[] evens = { 0, 2, 4, 6, 8 }; int[] odds = { 1, 3, 5, 7, 9 };
		 */
		int[] A = { 0, 2, 4, 6, 8 };
		int[] B = { 1, 3, 5, 7, 9 };

		int[] result_ = merge(A, B);

		// �迭 ����
		/*
		 * int[] result = merge(evens, odds);
		 */
		// ��� ���
		System.out.printf("��� : ");/*
									 * System.out.printf("���: ");
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
	
	// �� �迭�� �Է¹޾�, �ϳ��� �� �� �迭�� ��ȯ
	/*
	 * public static int[] merge(int[] arr1, int[] arr2) { int[] mergedArr = new
	 * int[arr1.length + arr2.length];
	 * 
	 * for (int i = 0; i < arr1.length; i++) { ��Ģ���� �ľ��Ͽ� �ش� �ݺ����� �ϼ��ϼ��� } return
	 * mergedArr; }
	 */
}