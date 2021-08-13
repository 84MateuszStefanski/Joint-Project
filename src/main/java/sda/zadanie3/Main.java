package sda.zadanie3;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle("Red",true, 5.0F);

        System.out.println(circle);

        Shape rectange = new Rectangle("Red",true,5,5);
        System.out.println(rectange.getColor());
        System.out.println(rectange.isFilled());
        System.out.println("Area " + rectange.getArea());
        System.out.println();

        Rectangle square = new Square("Red",true,3.0);
        System.out.println("Length :" + square.getLength());
        System.out.println("Is filled :" + square.isFilled());
        System.out.println("Color :" + square.getColor());
        System.out.println("Area :" + square.getArea());
        System.out.println("Perimeter :" + square.getPerimeter());

        Movable point = new MovablePoint(3,2);
        Movable circleMv = new MovableCircle(3);

        circleMv.moveDown();

        MovablePoint movablePoint = new MovablePoint(10, 10, 3, 3);
        System.out.println(movablePoint);
        movablePoint.moveRigth();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        Movable movableCircle = new MovablePoint(20, 30, 4, 4);
        System.out.println(movableCircle);
        movableCircle.moveRigth();
        movableCircle.moveUp();
        System.out.println(movableCircle);



    }
}
