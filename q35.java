class q35 {
	q35() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}

	public static void main(String args[]) {
		new q35();
	}
}