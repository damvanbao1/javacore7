package BTVN_7;

import java.util.Scanner;

public class SinhVien {
    public String maSinhVien;
    public String tenSinhVien;
    public String tenLop;
    public String tenKhoa;
    public SinhVien(){

    }

    public SinhVien(String maSinhVien, String tenSinhVien, String tenLop, String tenKhoa) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }
    public void inThongTin(){
        System.out.print("nhap ma sinh vien");
        maSinhVien = new Scanner(System.in).nextLine();
        System.out.print("nhap ten sinh vien");
        tenSinhVien= new Scanner(System.in).nextLine();
        System.out.print("nhap ten lop");
        tenLop =new Scanner(System.in).nextLine();
        System.out.print("nhap ten khoa");
        tenKhoa = new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        System.out.println("nhap thong tin sinh vien");
        SinhVien sv=new SinhVien();
        sv.inThongTin();
    }
}
