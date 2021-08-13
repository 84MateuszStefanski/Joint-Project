package sda.zadanie3;

public class MovableCircle implements Movable {

    private MovablePoint movablePoint =new MovablePoint();
    private int radius;

    public MovableCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public void moveUp() {
       movablePoint.y += movablePoint.ySpeed;
    }

    @Override
    public void moveDown() {
        movablePoint.y -= movablePoint.ySpeed;
    }

    @Override
    public void moveLeft() {
        movablePoint.x-= movablePoint.xSpeed;
    }

    @Override
    public void moveRigth() {
        movablePoint.x += movablePoint.xSpeed;
    }
}
