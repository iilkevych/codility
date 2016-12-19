package lessons.l4;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		int foundCount = X;
		boolean[] found = new boolean[X + 1];
		
		for (int i = 0; i < A.length; i++) {
			if(!found[A[i]]){
				found[A[i]] = true;
				foundCount --;
			}
			if(foundCount == 0){
				return i;
			}
		}
		return -1;
	}
}
