package BT.BT04;

import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        st.display();

        System.out.println("Nhập tên SV:");
        String name = sc.nextLine();
        st.setName(name);
        System.out.println("Nhập tên lớp:");
        String className = sc.nextLine();
        st.setClassName(className);

        st.display();
    }
}
