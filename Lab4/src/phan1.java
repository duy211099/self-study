public class phan1 {

    public phan1() {

    };

    public static double cau1(int n) {
        if (n == 1) {
            System.out.print(1 + " = ");
            return 1;
        }

        System.out.print("1 / (" + n + " * 3) " + " + ");
        return  (double) 1 / (n * 3) + cau1(n - 1);
    }

    public static double cau2(int n) {
        if (n == -1)
            return 1;

        double temp = 1;
        for (double i = 0; i <= n; i++) {

            // System.out.println(i);
            // System.out.println((double)2 * (i + 1) / (2 * i + 3));
            temp *= 2 * (i + 1) / (2 * i + 3);
        }
        // System.out.println("===");

        return temp + cau2(n - 1);
    }

    public static boolean cau3(int a, int b, int c) {

        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                System.out.println("Day la tam giac vuong");
            else if (a == b && b == c)
                System.out.println("Day la tam giac deu");
            else if (a == b || a == c || b == c)
                System.out.println("Day la tam giac can");
            else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
                System.out.println("Day la tam giac tu");
            else
                System.out.println("Day la tam giac nhon");

            return true;
        } else {
            System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");

            return false;
        }
    }

    static double cau4(int a, int b, int c) {
        if (!cau3(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double cau5(double a) {
        return a;
    }
}