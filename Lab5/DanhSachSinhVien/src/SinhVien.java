public class SinhVien {
    private String mssv;
    private String hoten;

    // public SinhVien(String mssv) {
    //     this.mssv = mssv;
    //     this.hoten = "Noname";
    // }

    public SinhVien(String mssv, String hoten) 
    {
        // if(mssv.length()!=7)
        // {
        //     return;
        // }
        this.mssv = mssv;
        this.hoten = hoten;
    }

    public String getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoten;
    }

    public void setMssv(String mssv) {
        if(mssv.isEmpty())
        {
            System.out.println("MSSV khong hop le.");
            return;
        }

        this.mssv = mssv;
    }

    public void setHoTen(String hoten) {
        if(hoten.isEmpty())
        {
            System.out.println("Ho ten khong hop le.");
            return;
        }

        this.hoten = hoten;
    }
}
