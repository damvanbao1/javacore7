package BTVN_7;

import java.util.Scanner;

public class SinhVien3 {
    public static int id=10000;
    public int maSv;
    public String ten;
    public String queQuan;
    public String gioiTinh;
    public double diemTB;
    public String khoa;

    public SinhVien3(int maSv, String ten, String queQuan, String gioiTinh, double diemTB, String khoa) {
        this.maSv = maSv;
        this.ten = ten;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "SinhVien3{" +
                "maSv=" + maSv +
                ", ten='" + ten + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemTB=" + diemTB +
                ", khoa='" + khoa + '\'' +
                '}';
    }
    public void inSinhVien3(){
        System.out.print("nhap ma sv");
        id=new Scanner(System.in).nextInt();
        System.out.print("nhap ten sv ");
        ten=new Scanner(System.in).nextLine();
        System.out.print("nhap dia chi");
        queQuan= new Scanner(System.in).nextLine();
        System.out.print("nhap gioi tinh ");
        gioiTinh= new Scanner(System.in).nextLine();
        System.out.print("nhap diem trung binh ");
        diemTB= new Scanner(System.in).nextFloat();
        System.out.print("nhap ten khoa ");
        khoa=new Scanner(System.in).nextLine();
    }
}
