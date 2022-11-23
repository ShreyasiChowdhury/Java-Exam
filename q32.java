class P {
	void show() {
		System.out.println("Default Acess");
	}
}

class Q extends P {
	public void show() {
		System.out.println("Public Acess");
	}
}

class R extends P {
	// private void show() {
	// System.out.println("Private Acess");
	// }
}

class q32 {
	public static void main(String args[]) {
		P obj1 = new P();
		obj1.show();
		Q obj2 = new Q();
		obj2.show();
		R obj3 = new R();
		obj3.show();
	}
}