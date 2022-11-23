class Parent {
	int id = 1;
	String name = "ABCD";
	String address = "Howrah";
}

class ChildOne {
	int id = 2;
	String name = "EFGH";
	String address = "SEALDAH";
	int marks = 100;
}

class ChildTwo {
	int id = 3;
	String name = "IJKL";
	String address = "Kolkata";
	String qualificatoion = "Graduate";
	int salary = 10000;
}

class q12 {
	public static void main(String args[]) {
		Parent obj1 = new Parent();
		ChildOne obj2 = new ChildOne();
		ChildTwo obj3 = new ChildTwo();
		System.out.println(obj1.name + " " + obj2.marks + " " + obj3.salary);
	}
}