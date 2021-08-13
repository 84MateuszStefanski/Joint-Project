package sda.oop.zadanie3;

public class Circle extends Shape {

    private float radius;


    public Circle() {
        this.radius = 1.0F;
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return " Circle with radius=" + radius +
                "which is a subclass off " +
                super.toString();
    }
    @Override
    public float getArea(){
        return (float)(Math.PI * (radius*radius));
    }
    @Override
    public float getPerimeter(){
        return (float)(2*Math.PI*radius);
    }
}
