class A {
	void show() {
		System.out.println("Parent class A");
	}
}

class B extends A {
	void show() {
		System.out.println("Subclass of A");
		A obj = new A();
		obj.show();
	}
}

class C extends B {
	void show() {
		System.out.println("Subclass of B");
		B obj = new B();
		obj.show();
	}
}

class q18 {
	public static void main(String args[]) {
		A obj1 = new A();
		obj1.show();
		B obj2 = new B();
		obj2.show();
		C obj3 = new C();
		obj3.show();
	}
}
