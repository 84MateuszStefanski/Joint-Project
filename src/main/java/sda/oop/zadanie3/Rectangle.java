package sda.oop.zadanie3;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle(String color, boolean isFilled, double
            width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public float getArea() {
        return (float) (width * length);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * width + 2 * length);
    }


    @Override
    public String toString() {
        return "double width " + width +
                " and length " + length
                + super.toString();
    }


}
