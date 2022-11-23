class Student {
	int total;

	void sub1(String title, int internal, int external, int id) {
		System.out.println("Student no. " + id + " :");
		total = 0;
		total = total + (internal + external);
		System.out.print("Total marks in " + title + " is " + total);
		if (total < 35) {
			System.out.println(" -> Fail");
		} else {
			System.out.println(" -> Pass");
		}
	}

	void sub2(String title, int internal, int external, int id) {
		System.out.println("Student no. " + id + " :");
		total = 0;
		total = total + (internal + external);
		System.out.print("Total marks in " + title + " is " + total);
		if (total < 35) {
			System.out.println(" -> Fail");
		} else {
			System.out.println(" -> Pass");
		}
	}

	void sub3(String title, int internal, int external, int id) {
		System.out.println("Student no. " + id + " :");
		total = 0;
		total = total + (internal + external);
		System.out.print("Total marks in " + title + " is " + total);
		if (total < 35) {
			System.out.println(" -> Fail");
		} else {
			System.out.println(" -> Pass");
		}
	}

}

class q15 {
	public static void main(String args[]) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		st1.sub1("History", 23, 70, 1);
		st1.sub2("Geography", 21, 8, 1);
		st1.sub3("Math", 30, 70, 1);

		st2.sub1("History", 24, 67, 2);
		st2.sub2("Geography", 12, 23, 2);
		st2.sub3("Math", 9, 7, 2);

		st3.sub1("History", 17, 56, 3);
		st3.sub2("Geography", 17, 70, 3);
		st3.sub3("Math", 30, 9, 3);
	}
}