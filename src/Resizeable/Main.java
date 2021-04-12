package Resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.resize(10);
        System.out.println(circle.getRadius());
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1);
        circles[1] = new Circle(5.3);
        circles[2] = new Circle(9.3);
        System.out.println("Kích thước ban đầu");
        for (Circle x :circles) {
            System.out.println(x);
        }
        System.out.println("Kích thước sau tăng");
        for (Circle x : circles) {
            x.tangKichThuoc();
            System.out.println(x);
        }
    }
}
