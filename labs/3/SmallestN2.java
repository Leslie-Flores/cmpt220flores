// Leslie Flores
// February 22nd, 2017
// Find that smallest n that is greater than 12000

public class SmallestN2 {
	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 2) <= 12000) {
			n++;
		}
		System.out.println("The smallest n of n^2 that is greater than 12,000 is " + n + ".");
	}
}