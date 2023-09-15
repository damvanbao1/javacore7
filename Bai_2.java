package BTVN_7;

import java.util.Scanner;

public class Bai_2{
    public static void main(String[] args) {
        SinhVien[] mangSv= inputSinhVien();
    }
    public static SinhVien[] inputSinhVien(){
        System.out.print("Nhap so sinh vien");
        int n= new Scanner(System.in).nextInt();
        SinhVien[] mangSv= new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cua sinh vien");
            mangSv[i] =new SinhVien();
            mangSv[i].inThongTin();


        }
        return mangSv;

    }
}
