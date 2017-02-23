// Leslie Flores
// February 22, 2017
// Find the largest n

public class LargestN3 {
	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n + 1, 3) <= 12000) {
			n++;
		}
		System.out.println("The largest integer n of n^3 is less than 12,000 is " + n + ".");
	}
}