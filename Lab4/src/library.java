import java.util.Scanner;

public class library {
    static int NhapSoNguyenDuong() {
        int n = 0;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }

                if (n > 0) {
                    break;
                }

                System.out.println("Nhap lai: ");
                sc.next();
            } while (true);

            return n;
        }
    }

    static int NhapSoNguyenDuong(Scanner sc) {

        int n = 0;

        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }

            if (n > 0) {
                break;
            }

            System.out.println("Nhap lai: ");
            sc.next();
        } while (true);

        return n;
    }
}