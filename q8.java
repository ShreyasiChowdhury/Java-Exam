import java.lang.Math;

class q8 {
    double r, h, l;

    q8(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        l = Math.sqrt(h * h + r * r);
        double area = Math.PI * r * (l + r);
        System.out.println("The area is: " + area);
    }

    void volume() {
        double vol = Math.PI * r * r * h / 3;
        System.out.println("The volume is: " + vol);
    }

    public static void main(String args[]) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        q4 obj = new q4(a, b);
        obj.area();
        obj.volume();
    }
}
