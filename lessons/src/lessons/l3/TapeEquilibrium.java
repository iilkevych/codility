package lessons.l3;

public class TapeEquilibrium {
	public int solution(int[] A){
		int sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		int min = Integer.MAX_VALUE, abs = 0, partial = 0;
		for(int i = 0; i < A.length - 1; i++){
			partial += A[i];
			abs = Math.abs(partial - (sum - partial));
			if(min> abs){
				min = abs;
			}
		}
		return min;
	}

}
