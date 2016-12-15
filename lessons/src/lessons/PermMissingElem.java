package lessons;

public class PermMissingElem {
	int solution(int A[]) {
		int result = A.length + 1;
		for (int i = 0; i < A.length; i++) {
			result ^= i + 1;
			if (A[i] <= A.length + 1) {
				result ^= A[i];
			}
		}
		return result;
	}
}
