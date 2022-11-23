class q6 {
	public static void main(String args[]) {
		System.out.println("First 10 numbers of Fibonacci Series:");
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		int n = 8;
		while (n > 0) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			n--;
		}
	}
}