package BTVN_7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng điểm (n): ");
        int n = scanner.nextInt();
        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tọa độ x cho điểm " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            System.out.print("Nhập tọa độ y cho điểm " + (i + 1) + ": ");
            double y = scanner.nextDouble();
            points[i] = new MyPoint(x, y);
        }
        double maxDistance = 0;
        MyPoint maxPoint1 = null;
        MyPoint maxPoint2 = null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = MyPoint.distance(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    maxPoint1 = points[i];
                    maxPoint2 = points[j];
                }
            }
        }

        System.out.println("Hai điểm có khoảng cách lớn nhất là:");
        System.out.println("Điểm 1: (" + maxPoint1.getX() + ", " + maxPoint1.getY() + ")");
        System.out.println("Điểm 2: (" + maxPoint2.getX() + ", " + maxPoint2.getY() + ")");
        System.out.println("Khoảng cách giữa chúng: " + maxDistance);


    }

}
