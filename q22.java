import java.util.Scanner;

class q22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		System.out.println("Enter the starting index and number of characters:");
		int pos = sc.nextInt();
		int count = sc.nextInt();
		System.out.println(s.substring(pos, pos + count));
	}
}
