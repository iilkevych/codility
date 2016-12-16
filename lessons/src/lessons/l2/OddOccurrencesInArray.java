package lessons.l2;

public class OddOccurrencesInArray {
	int solution(int[] a) {
		int xor = 0;
		for (int i : a) {
			xor ^= i;
		}
		return xor;
	}
}
