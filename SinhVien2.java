package BTVN_7;

import java.util.Scanner;

public class SinhVien2 {
    public int id;
    public String name;
    public String gioiTinh;
    public String queQuan;
    public float diemTrungBinh;
    public String tenKhoa;

    public SinhVien2(int id, String name, String gioiTinh, String queQuan, float diemTrungBinh, String tenKhoa) {
        this.id = id;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diemTrungBinh = diemTrungBinh;
        this.tenKhoa = tenKhoa;
    }
    public SinhVien2(){

    }

    @Override
    public String toString() {
        return "SinhVien2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }
    public void inSinhVien2(){
        System.out.print("nhap ma sv");
        id=new Scanner(System.in).nextInt();
        System.out.print("nhap ten sv ");
        name=new Scanner(System.in).nextLine();
        System.out.print("nhap dia chi");
        queQuan= new Scanner(System.in).nextLine();
        System.out.print("nhap gioi tinh ");
        gioiTinh= new Scanner(System.in).nextLine();
        System.out.print("nhap diem trung binh ");
        diemTrungBinh= new Scanner(System.in).nextFloat();
        System.out.print("nhap ten khoa ");
        tenKhoa=new Scanner(System.in).nextLine();
    }
}
