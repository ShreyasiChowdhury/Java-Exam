import java.util.Scanner;

class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		if (n < 6) {
			System.out.println("Less size");
			System.exit(0);
		} else {
			int[] arr = new int[n];
			System.out.println("Enter the array elements:");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("The Array Elements are:");
			for (int i : arr) {
				System.out.print(i + " ");
			}
		}
	}
}