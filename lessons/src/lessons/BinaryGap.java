package lessons;

public class BinaryGap {

	public int solution(int N) {
		int count = 0, max = 0;
		boolean found = false;
		
		while(N > 0) {
			if((N & 1) == 1){
				if(count > max){
					max = count;
				}
				count = 0;
				found = true;
			} else if (found) {
				count++;
			}
			N = N >> 1;
		}
		return max;
	}
}
