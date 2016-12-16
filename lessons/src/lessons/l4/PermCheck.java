package lessons.l4;

public class PermCheck {
	public int solution(int A[]) {
		boolean[] results = new boolean[A.length + 1];
		for (int i = 0; i < A.length; i++) {
			if(A[i] > 0 && A[i] <= A.length)
				results[A[i]] = true;
		}
		
		for(int i = 1; i < results.length; i++){
			if(!results[i])
				return i;
		}
		return results.length;
	}
}

/*
for()


*/