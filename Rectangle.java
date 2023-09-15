package BTVN_7;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;
    public String color;
    public Rectangle() {
        width = 1.0;
        height = 1.0;
        color = "red";
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width =width;
    }
    public  double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*width+2*height;
    }

    public static void main(String[] args) {
        System.out.print("nhap chieu dai:");
        double width =new Scanner(System.in).nextDouble();
        System.out.print("nhap chieu rong:");
        double height=new Scanner(System.in).nextDouble();
        System.out.print("nhap mau sac:");
        String color = new Scanner(System.in).nextLine();
        Rectangle rectangle=new Rectangle(width,height,color);
        System.out.println("thong tin cua hinh chu nhat");
        System.out.println("chieu dai: "+rectangle.getWidth());
        System.out.println("chieu rong: "+rectangle.getHeight());
        System.out.println("mau sac: "+rectangle.getColor());
        System.out.println("dien tich: "+rectangle.findArea());
        System.out.println("chu vi: "+rectangle.findPerimeter());
    }
}
