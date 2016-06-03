package diakabanab.codingbat.warmup1;

class IntMax {
	public int intMax(int a, int b, int c) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return Math.max(c, max);
	}
}
