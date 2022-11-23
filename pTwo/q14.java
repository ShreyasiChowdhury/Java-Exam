package pTwo;

import pOne.A;

class B extends A {
	void display() {
		System.out.println(x);
		System.out.println("Calling method of class A: ");
		show();
		System.out.println("Method of B");
	}
}

class q14 {
	public static void main(String args[]) {
		B obj = new B();
		obj.display();
	}
}