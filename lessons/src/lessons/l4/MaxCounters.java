package lessons.l4;

public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int maxCount = 0, tmpMaxCount = 0;
		int[] counters = new int[N];
		for(int c = 0; c < counters.length; c++){
			counters[c] = maxCount;
		}
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > N){
				maxCount = tmpMaxCount;
			} 
			if( A[i] <= N) {
				if(counters[A[i]-1] < maxCount) {
					counters[A[i]-1] = maxCount;
				}
				counters[A[i]-1] ++;
				if(counters[A[i]-1] > tmpMaxCount){
					tmpMaxCount = counters[A[i]-1];
				}
			}
		}
		for(int c = 0; c < counters.length; c++){
			
			if(counters[c] < maxCount) {
				counters[c] = maxCount;
			}
		}
		return counters;
	}
}
