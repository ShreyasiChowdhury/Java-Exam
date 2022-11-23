import java.util.Scanner;

class q30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.next();
		s = s.replace("a", "x");
		s = s.replace("A", "X");
		System.out.println(s);
	}
}