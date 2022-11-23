import java.util.Scanner;

class q0 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int num = n;
		int c = 0;
		while (num != 0) {
			num = num / 10;
			c++;
		}
		if (c != 4) {
			System.out.println("Reject");
			System.exit(0);
		} else {
			int rev = 0;
			while (n != 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n = n / 10;
			}
			System.out.println("The reversed number is: " + rev);
		}
	}
}
