interface Hello {
    public String sayHello(String name, String com);
}

public class App {
    public static void main(String[] args) throws Exception {

    }

    // ===================================
    // ==============CAU 1================
    // ===================================
    public static void Cau1() {
        System.out.println("HI ALL! WELCOME TO CODE P SOFT GROUP!");
    }

    // ===================================
    // ==============CAU 2================
    // ===================================
    public static float Cau2(float a, float b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Error!");
        }
    }

    public static int Cau2(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Error!");
        }
    }

    public static double Cau2(double a, double b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Error!");
        }
    }

    // ===================================
    // ==============CAU 3================
    // ===================================
    public static double Cau3(double a, double b) {
        return a * a + b;
    }

    // ===================================
    // ==============CAU 4================
    // ===================================
    public static double Cau4(int a, int b) {
        return a / b;
    }

    // ===================================
    // ==============CAU 5================
    // ===================================
    public static double Cau5(double a, double b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Error!");
        }
    }

    // ===================================
    // ==============CAU 6================
    // ===================================
    public static void Cau6() {
        // ??
    }

    // ===================================
    // ==============CAU 8================
    // ===================================
    public static int Cau8(int a) {

        System.out.println("Truoc thay doi: " + a + " Sau thay doi: " + ++a);
        // TODO: Update cau 8!
        return a;
    }

    // ===================================
    // ==============CAU 10================
    // ===================================
    // Câu 10 không cần review nhé!
    public static double Cau10(int a) {
        return a;
    }

    public static int Cau10(float a) {
        return (int) a;
    }

    public static int Cau10(double a) {
        return (int) a;
    }
}
