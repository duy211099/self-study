import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(final String[] args) {

        System.out.println(cauHai(1));

        /*
         * System.out.println("========================>MENU<========================");
         * System.out.println("0MENU"); System.out.println("1MENU");
         * System.out.println("2MENU"); System.out.println("3MENU");
         * System.out.println("4MENU"); System.out.println("5MENU");
         * 
         * do { xuly_Menu(chonMenu(sc), sc); } while (true);
         */
    }

    public static int chonMenu(Scanner sc) {
        int n = 0;

        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                sc.next();
            }

            if (n >= 0 && n <= 5) {
                break;
            } else {
                System.out.println("Chon lai:");
            }

        } while (true);

        return n;
    }

    public static void xuly_Menu(int stt_Menu, Scanner sc) {
        switch (stt_Menu) {
            case 1:
                System.out.println("Cau1: ");
                int n = library.NhapSoNguyenDuong(sc);
                System.out.print("Dap an: ");
                System.out.println(phan1.cau1(n));

                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 0:
                System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                System.exit(0); // thoát chương trình
                break;
        }
    }

}
