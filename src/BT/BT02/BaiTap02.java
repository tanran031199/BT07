package BT.BT02;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaticMethod st = new StaticMethod();

        System.out.println("Nhập bán kính hình tròn:");
        double r = Double.parseDouble(sc.nextLine());
        System.out.printf("Diện tích hình tròn là: %.2f.\n", st.calCircleArea(r));

        System.out.println("Nhập chiều dài hình chữ nhật:");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng hình chữ nhật:");
        double width = Double.parseDouble(sc.nextLine());

        if (width > height) {
            System.out.println("Chiều rộng không thể lớn hơn chiều dài!");
        } else {
            System.out.printf("Diện tích hình chữ nhật là: %.2f.\n", st.calRectangleArea(width, height));
        }

        System.out.println("Nhập 3 cạnh tam giác:");
        System.out.println("Cạnh a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Cạnh b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Cạnh c:");
        double c = Double.parseDouble(sc.nextLine());

        if (a + b > c && b + c > a && a + c > b) {
            System.out.printf("Diện tích hình tam giác là: %.2f.\n", st.calTriangleArea(a, b, c));
        } else {
            System.out.println("Cạnh nhập vào không hợp lệ!");
        }

    }
}
