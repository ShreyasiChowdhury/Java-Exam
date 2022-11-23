package pkgTwo;

import pkgOne.X;

class q24 implements X {
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
        q24 obj = new q24();
        obj.A();
        obj.B();
        obj.C();
    }
}