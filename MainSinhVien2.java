package BTVN_7;

import java.util.Random;
import java.util.Scanner;

public class MainSinhVien2 {
    public static void main(String[] args) {
            SinhVien2[] sv2= nhapthongtinSinhVien();
            doithongtinSinhVien(sv2);
            inSinhVien2(sv2);
            xoaSinhVien(sv2);
            inSinhVien2(sv2);

    }
    public static void inSinhVien2(SinhVien2[] sv2){
        for (int i = 0; i < sv2.length ; i++) {
            System.out.println(sv2[i]);
        }
        System.out.println();

    }
    public static void xoaSinhVien(SinhVien2[] sv2){
        int random = new Random().nextInt();
        if (sv2.length==0){
            System.out.println("danh sach sinh vien rong");
            return;
        }
        sv2[random]=null;
        for (int i = random; i < sv2.length-1; i++) {
            sv2[i]=sv2[i+1];
        }
        System.out.println("sinh vien da duoc xoa");




    }
    private static void doithongtinSinhVien(SinhVien2[] sv2){
        int random= new Random().nextInt();
        sv2[random].inSinhVien2();
    }
    public static SinhVien2[] nhapthongtinSinhVien(){
        System.out.print("nhap so luong sinh vien ");
        int n= new Scanner(System.in).nextInt();
        SinhVien2[] sv2= new SinhVien2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cua sinh vien thu "+(i+1));
            sv2[i] = new SinhVien2();
            sv2[i].inSinhVien2();
        }
        return sv2;
    }
}
