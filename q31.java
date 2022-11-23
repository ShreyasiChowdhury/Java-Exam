import java.util.Scanner;

class B {
	public int data;

	B(int data) {
		this.data = data;
	}

}

class A {
	public B fun(B obj) {
		return obj;
	}
}

class q31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		B objb = new B(sc.nextInt());
		A obja = new A();
		System.out.println("Return object's data " + obja.fun(objb).data);
	}
}