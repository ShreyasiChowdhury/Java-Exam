import java.lang.Math;

class Figure {

	void area(int a, int b, int c) {
		float x = (a * b) + (b * c) + (c * a);
		float area = 2 * x;
		System.out.println("Area of the paralelopiped is: " + area);
	}

	void area(int a) {
		float area = 6 * a * a;
		System.out.println("Area of the cube is: " + area);
	}

	void area(float r, float h) {
		double area = 2 * Math.PI * r * (h + r);
		System.out.println("Area of the cylinder is: " + area);
	}

	void area(double r) {
		double area = 4 * Math.PI * r * r;
		System.out.println("Area of the sphere is: " + area);
	}

}

class q11 {
	public static void main(String args[]) {
		Figure obj = new Figure();
		obj.area(12, 21, 23);
		obj.area(2);
		obj.area(10, 20);
		obj.area(5.5);
	}
}