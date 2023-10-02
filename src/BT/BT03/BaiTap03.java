package BT.BT03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        System.out.printf("Bán kính hình tròn c1: %.2f.\n", c1.getRadius());
        System.out.printf("Diện tích hình tròn c1: %.2f.\n", c1.getArea());

        System.out.println("Nhập vào bán hình tròn c2:");
        double r = Double.parseDouble(sc.nextLine());

        Circle c2 = new Circle(r, "blue");
        System.out.printf("Bán kính hình tròn c2: %.2f.\n", c2.getRadius());
        System.out.printf("Diện tích hình tròn c2: %.2f.\n", c2.getArea());
    }
}
