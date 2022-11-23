class EMP {
	String s = "";
	String name = "Shree";
	String id = "132";

	public String toString() {
		s = "Name: ";
		s = s + name + " ";
		s = s + "Id: ";
		s = s + id;
		return s;
	}
}

class Scientist extends EMP {
	String no = "100";
	String experience = "Senior";

	public String toString() {
		s = s + "Number of Publication: ";
		s = s + no + " ";
		s = s + "Experience: ";
		s = s + experience;
		return s;
	}
}

class DScientist extends Scientist {
	String award = "4";

	public String toString() {
		s = s + "Number of Award: ";
		s = s + award;
		return s;
	}
}

class q34 {
	public static void main(String args[]) {
		EMP obj1 = new EMP();
		System.out.println(obj1.toString());
		EMP obj2 = new Scientist();
		System.out.println(obj2.toString());
		EMP obj3 = new DScientist();
		System.out.println(obj3.toString());
	}
}