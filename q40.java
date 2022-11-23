import java.util.Scanner;

class q40 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String f_name = sc.nextLine();
		System.out.println("Enter midlle name (NA if you don't have):");
		String m_name = sc.nextLine();
		System.out.println("Enter last name:");
		String l_name = sc.nextLine();
		System.out.println("Enter roll:");
		String roll = sc.nextLine();
		String ans = "";
		ans = ans + f_name.charAt(0);
		if (m_name.equals("NA"))
			ans = ans + "";
		else
			ans = ans + m_name.charAt(0);
		ans = ans + l_name.charAt(0);
		ans = ans + roll.substring(roll.length() - 4, roll.length());
		System.out.println("Password is: " + ans);
	}
}