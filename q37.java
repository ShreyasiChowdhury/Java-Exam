abstract class TwoD {
	double s1;
	double s2;

	TwoD(double s1, double s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	abstract void area();
}

class Rectangle extends TwoD {
	Rectangle(double s1, double s2) {
		super(s1, s2);
	}

	void area() {
		System.out.println("Area of the Recatngle is" + (s1 * s2));
	}
}

class Triangle extends TwoD {
	Triangle(double s1, double s2) {
		super(s1, s2);
	}

	void area() {
		System.out.println("Area of the Triangle is:" + (0.5 * s1 * s2));
	}
}

class q37 {
	public static void main(String args[]) {
		TwoD obj1 = new Rectangle(5.25, 4.75);
		obj1.area();
		TwoD obj2 = new Triangle(5.25, 4.75);
		obj2.area();
	}
}
