package diakabanab.codingbat.warmup1;

public class Front22 {
	public String front22(String str) {
		  int frontChar = 2;
		  if (frontChar > str.length()) {
		    frontChar = str.length();
		  }
		  
		  String front = str.substring(0, frontChar);
		  return front + str + front;
		}
}