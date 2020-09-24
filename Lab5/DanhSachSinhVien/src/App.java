import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        DanhSachSinhVien danhsach=new DanhSachSinhVien();

        danhsach.themSinhVien(new SinhVien("1810111","Pham A"));
        danhsach.themSinhVien(new SinhVien("1710213","Nguyen B"));
        danhsach.themSinhVien(new SinhVien("1854341","Van C"));
        danhsach.themSinhVien(new SinhVien("1252342","Thi D"));
        danhsach.themSinhVien(new SinhVien("1252342","Nguyen B"));

        danhsach.xoaSinhVien("1810111");

        danhsach.xuatDanhSach();
    }
}
