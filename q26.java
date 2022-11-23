class Bank {
	String name;
	int acc;
	String type;
	double bal;

	void assign(String a, int b, String c, double d) {
		name = a;
		acc = b;
		type = c;
		bal = d;
	}

	void deposit(double x) {
		bal = bal + x;
	}

	void withdraw(double y) {
		System.out.println("Balance is: " + bal);
		bal = bal - y;
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Balance : " + bal);
		System.out.println("Account Number : " + acc);
		System.out.println("Account Type : " + type);
	}
}

class q26 {
	public static void main(String args[]) {
		Bank obj = new Bank();
		obj.assign("Alexa", 1177, "Personal", 10000);
		obj.deposit(60000);
		obj.withdraw(500);
		obj.display();
	}
}