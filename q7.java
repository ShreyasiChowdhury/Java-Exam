class q7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            double d = i * i;
            double b = 1 / d;
            if (i % 2 == 1) {
                ans = ans + b;
            } else
                ans = ans - b;
        }
        System.out.println("The sum = " + ans);
    }
}
