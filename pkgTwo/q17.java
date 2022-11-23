package pkgTwo;

import pkgOne.X;

class q17 implements X {
    public void A() {
        System.out.println("In A");
    }

    public void B() {
        System.out.println("In B");
    }

    public void C() {
        System.out.println("In C");
    }

    public static void main(String args[]) {
        q17 obj = new q17();
        obj.A();
        obj.B();
        obj.C();
    }
}