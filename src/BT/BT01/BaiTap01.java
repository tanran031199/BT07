package BT.BT01;

public class BaiTap01 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("str");

        System.out.println(obj1.getMyString());

        obj1.setMyString("newStr");
        System.out.println(obj1.getMyString());
    }
}
