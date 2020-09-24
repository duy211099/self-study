import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cau1();
        Cau2();
        // Cau3();
        // Cau4();
        // Cau5();
        // Cau6();
        // Cau7();
        // Cau8();
        // Cau9();
        // Cau10();
    }

    // ============================
    // ===========Cau1=============
    // ============================
    static void Cau1() {
        ->
        System.out.println("So nguyen duong vua nhap la: " + NhapSoNguyenDuong());
    }
    static void Cau1a() -> System.out.println("So nguyen duong vua nhap la: " + NhapSoNguyenDuong());
    
    // ============================
    // ===========Cau2=============
    // ============================
    static void Cau2() {
        int[] arr = NhapMang();

        XuatMang(arr);
    }

    // ============================
    // ===========Cau3=============
    // ============================
    static void Cau3() {
        int[] arr = NhapMang();

        XuatMang(arr);

        System.out.println("Gia tri lon nhat: " + Max(arr));

        System.out.println("Gia tri nho nhat: " + Min(arr));
    }

    // ============================
    // ===========Cau4=============
    // ============================
    static void Cau4() {
        int[] arr = NhapMang();

        XuatMang(arr);
        System.out.println("Co " + Count(arr, Max(arr)) + " phan tu co gia tri lon nhat: " + Max(arr));
        System.out.println("Co " + Count(arr, Min(arr)) + " phan tu co gia tri nho nhat: " + Max(arr));
    }

    // ============================
    // ===========Cau5=============
    // ============================
    static void Cau5() {
        try (Scanner sc = new Scanner(System.in)) {
            int n;

            do {
                System.out.println("Nhap n nguyen duong:");
                while (!sc.hasNextInt()) {
                    System.out.println("Nhap mot so nguyen duong:");
                    sc.next();
                }
                n = sc.nextInt();
            } while (n <= 0);
            int[] arr = NhapMangRandom(n * 10);

            XuatMang(arr);

            System.out.println("Tong cac so le: " + TongSoLe(arr));
            System.out.println("Tong cac so chan: " + TongSoChan(arr));

            XuatSoLe(arr);
            XuatSoChan(arr);

        }
    }

    // ============================
    // ===========Cau6=============
    // ============================
    static void Cau6() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = NhapMangRandom();

            XuatMang(arr);

            int rs = 0;
            for (int n : arr) {
                if (n % 5 == 0 && n % 2 == 0) {
                    rs += n;
                    System.out.print(n + " ");
                }
            }
            System.out.println();
            System.out.println("Tong cac so chia het cho 2 va 5: " + rs);
        }
    }

    // ============================
    // ===========Cau7=============
    // ============================
    static void Cau7() {
        int n, rs = 1;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Nhap mot so nguyen duong:");
                while (!sc.hasNextInt()) {
                    System.out.println("Nhap mot so nguyen duong:");
                    sc.next();
                }
                n = sc.nextInt();
            } while (n <= 0);
        }

        System.out.println("Ket qua: ");
        for (int i = 1; i <= n; i++) {
            rs *= i;
        }
        System.out.println(rs);
        System.out.println();
    }

    // ============================
    // ===========Cau8=============
    // ============================
    static void Cau8() {
        int[] arr = NhapMangRandom();

        XuatMang(arr);

        System.out.print("Cac phan tu co so cuoi cung la so chan: ");

        for (int n : arr) {
            if ((n % 10) % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }

    // ============================
    // ===========Cau9=============
    // ============================
    static void Cau9() {
        int[] arr = NhapMangRandom();

        XuatMang(arr);

        System.out.print("Cac phan tu co so cuoi cung la so le: ");

        for (int n : arr) {
            if ((n % 10) % 2 == 1) {
                System.out.print(n + " ");
            }
        }
    }

    // ============================
    // ===========Cau10============
    // ============================
    static void Cau10() {
        try (Scanner sc = new Scanner(System.in)) {
            int n=NhapSoNguyenDuong();

            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Nhap chuoi: ");
                arr[i] = sc.next();
            }

            XuatMang(arr);
        }
    }

    // ============================
    // ==========Chung=============
    // ============================

    static int NhapSoNguyenDuong() {
        int n = 0;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                } else {
                    System.out.println("Nhap lai: ");
                    sc.next();
                }
            } while (n <= 0);
            
            return n;
        }
    }

    static int NhapSoNguyenDuong(Scanner sc) {
        int n = 0;

        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.out.println("Nhap lai: ");
                sc.next();
            }
        } while (n <= 0);
        
        return n;
    }

    static void MinMax(int[] arr) {
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }

    static int Max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    static int Min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    static int Count(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }

        return count;
    }

    static int[] NhapMang() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = NhapSoNguyenDuong(sc);

            int[] arr = new int[n];


            for (int i = 0; i < n; i++) {
                arr[i] = NhapSoNguyenDuong(sc);
            }

            System.out.println();
            return arr;
        }
    }

    static int[] NhapMangRandom() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = NhapSoNguyenDuong();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = -100 + (int) (Math.random() * ((100 + 100) + 1));
            }

            System.out.println();
            return arr;
        }
    }

    static int Tong(int[] arr) {
        int rs = 0;

        for (int n : arr) {
            rs += n;
        }

        return rs;
    }

    static int TongSoLe(int[] arr) {
        int rs = 0;

        for (int n : arr) {
            if (n % 2 == 1)
                rs += n;
        }

        return rs;
    }

    static int TongSoChan(int[] arr) {
        int rs = 0;

        for (int n : arr) {
            if (n % 2 == 0)
                rs += n;
        }

        return rs;
    }

    static int Hieu(int[] arr) {
        int rs = 0;

        for (int n : arr) {
            rs -= n;
        }

        return rs;
    }

    static int[] NhapMangRandom(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = -100 + (int) (Math.random() * ((100 + 100) + 1));
        }

        System.out.println();
        return arr;
    }

    static void XuatMang(int[] arr) {
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void XuatMang(String[] arr) {
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void XuatMang(int n) {
        System.out.println("Ket qua: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void XuatSoLe(int[] arr) {
        System.out.println("Cac so le: ");
        for (int n : arr) {
            if (n % 2 == 1)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    static void XuatSoChan(int[] arr) {
        System.out.println("Cac so chan: ");
        for (int n : arr) {
            if (n % 2 == 0)
                System.out.print(n + " ");
        }
        System.out.println();
    }

}

// try(Scanner sc = new Scanner(System.in)){
// //rest of your code
// }