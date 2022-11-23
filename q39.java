import java.util.*;

class q39 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = sc.nextInt();
		double sum = 1, fact = 1;
		for (int i = 2, j = 1; i <= n; ++i, ++j) {
			fact *= j;
			sum += Math.pow(-1, j) * Math.pow(fact, -1);
		}

		System.out.println("Sum: " + sum);
	}
}