package lessons;

public class CyclicRotation {

	public int[] solution(int[]A, int K) {
		if(K > 100 || K <= 0 || A.length > 100 || A.length == 0) {
			return A;
		}
				
		int[] result = new int[A.length];
		for(int c = 0; c < A.length; c++) {
			result[(K + c) % A.length] = A[c];
		}
		return result;
	}
}
