public class q10 {
	int x;
	static int y;

	q10(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		q10 ob1 = new q10(20, 30);
		System.out.println("Object 1 non-Static value : " + ob1.x);
		System.out.println("Object 1 Static value : " + ob1.y);
		q10 ob2 = new q10(40, 60);
		System.out.println("Object 2 non-Static value : " + ob2.x);
		System.out.println("Object 2 Static value : " + ob2.y);
		System.out.println("Object 1 non-Static value : " + ob1.x);
		System.out.println("Object 1 Static value : " + ob1.y);
	}
}