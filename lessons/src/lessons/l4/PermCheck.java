package lessons.l4;

public class PermCheck {
	public int solution(int A[]) {
		int xor = 0;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > A.length)
				return 0;
			else {
				xor ^= i + 1;
				xor ^= A[i];
			}
		}
		return xor == 0? 1:0;
	}
}
