package BT.BT02;

public class StaticMethod {
    public static final double PI = 3.14;

    public double calCircleArea(double r) {
        double area = PI * Math.pow(r, 2);
        return area;
    }

    public double calRectangleArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public double calTriangleArea(double a, double b, double c) {
        double p = a + b + c;
        double area = Math.sqrt(p/2 * (p/2 - a) * (p/2 - b) * (p/2 - c));
        return area;
    }
}
