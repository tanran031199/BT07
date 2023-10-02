package BT.BT04;

public class Student {
    private String name = "John", className = "CO2";

    public Student() {
    }

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void display() {
        System.out.println("Tên SV: " + name);
        System.out.println("Tên lớp: " + className);
    }
}
