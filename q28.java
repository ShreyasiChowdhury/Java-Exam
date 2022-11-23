abstract class Test {
	public void show() {
		System.out.println("This is concrete method 1");
	}

	public void display() {
		System.out.println("This is concrete method 2");
	}
}

class q28 extends Test {
	public static void main(String args[]) {
		Test obj = new q28();
		obj.show();
		obj.display();
	}
}