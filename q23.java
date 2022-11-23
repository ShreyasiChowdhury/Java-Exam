class Tree {
	int code;
	int height;
	int basew;

	void annualUpdate(int h, int b, int amt) {
		height = h;
		basew = b;
		System.out.println(height + " " + basew + " " + amt);
	}
}

class Mango extends Tree {
	String yeild = " ";
	int a;

	void annualUpdate(int h, int b, int amt) {
		height = h;
		basew = b;
		a = amt;
		System.out.println(height + " " + basew + " " + amt);
	}

	void displayTree(String y) {
		yeild = y;
		System.out.println(height + " " + basew + " " + a + " " + yeild);
	}
}

class Garden {
	public static void main(String args[]) {
		Tree t1 = new Tree();
		Tree t2 = new Tree();
		t1.annualUpdate(210, 50, 5000);
		t2.annualUpdate(280, 22, 1000);
		Mango t3 = new Mango();
		Mango t4 = new Mango();
		t3.annualUpdate(230, 56, 1111);
		t4.annualUpdate(240, 45, 2333);
		t3.displayTree("good");
		t4.displayTree("bad");
	}
}
