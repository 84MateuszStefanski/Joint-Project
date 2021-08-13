package sda.oop.zadanie7;

public class Circle implements GeometricObject {

    protected float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (float)(2*Math.PI*radius);
    }

    @Override
    public double getArea() {
        return (float)(Math.PI * (radius*radius));
    }
}
