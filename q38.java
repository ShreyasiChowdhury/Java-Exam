import java.util.Scanner;

class q38 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		int len1 = s.length();
		s = s.trim();
		int len2 = s.length();
		System.out.println("Original length: " + len1);
		System.out.println("Length without spaces: " + len2);
	}
}