import java.util.List;
import java.util.ArrayList;

public class DanhSachSinhVien {
    private List<SinhVien> danhsach;

    public DanhSachSinhVien() {
        danhsach = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien newSv) {
        for (SinhVien sv : danhsach) {
            if (sv.getMssv() == newSv.getMssv()) {
                System.out.println("Sinh vien [" + sv.getMssv() + " " + sv.getHoTen() + "] da ton tai.");
                return;
            }
        }

        danhsach.add(newSv);
        System.out.println("Da them [" + newSv.getMssv() + " " + newSv.getHoTen() + "] vao danh sach.");
    }

    public void xoaSinhVien(String mssv) {
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getMssv() == mssv) {
                danhsach.remove(i);
                System.out.println("Da xoa sinh vien co ma so [" + mssv+"].");
                return;
            }
        }

        System.out.println("Sinh vien co ma so [" + mssv+ "] khong ton tai");
    }

    public void xuatDanhSach() {
        System.out.println("***Danh sach sinh vien***");
        System.out.println("  MSSV"+"\t\t"+"Ho ten");
        for (SinhVien sv : danhsach) {
            System.out.println(sv.getMssv() + "\t\t" + sv.getHoTen());
        }
    }
}
