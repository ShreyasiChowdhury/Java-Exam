import java.util.*;

class q21 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				sum = sum + Math.pow(i, i);
			} else
				sum = sum - Math.pow(i, i);
		}
		System.out.println("Final answer: " + sum);
	}
}
