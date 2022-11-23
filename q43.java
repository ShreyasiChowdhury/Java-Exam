import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
	public PayOutOfBoundsException(String message) {
		super(message);
	}
}

class q43 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary:");
		int salary = sc.nextInt();
		try {
			if (salary < 10000)
				throw new PayOutOfBoundsException("Exception here");
			else
				System.out.println("He is happy");
		} catch (PayOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}