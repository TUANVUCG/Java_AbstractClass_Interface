package Resizeable;

public class Circle implements Resizeable{
    double radius;
    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void tangKichThuoc(){
        radius *= Math.floor(Math.random()*100);
    }
    @Override
    public void resize(double percent) {
        radius = radius + radius*percent/100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
