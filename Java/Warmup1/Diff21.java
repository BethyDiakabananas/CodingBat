package diakabanab.codingbat.warmup1;

public class Diff21 {
	public int diff21(int n) {
		if (n <= 21)
			return 21 - n;
		else
			return 2 * (n-21);
	}
}
