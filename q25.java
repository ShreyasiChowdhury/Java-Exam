import java.util.*;

class q25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		char[] ch = new char[50];
		System.out.println("Enter the characters:");
		for (int i = 0; i < 10; i++) {
			ch[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < s.length(); i++) {
			ch[10 + i] = s.charAt(i);
		}
		for (int i = 0; i < (10 + s.length()); i++) {
			System.out.print(ch[i]);
		}
	}
}