class Demo {
	void show() {
		System.out.println("I am Demo");
	}
}

class q42 {
	public static void main(String args[]) {
		try {
			Demo obj = new Demo();
			obj = null;
			obj.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}