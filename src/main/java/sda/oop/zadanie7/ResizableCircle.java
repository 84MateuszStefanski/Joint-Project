package sda.oop.zadanie7;

public class ResizableCircle  extends Circle implements  Resizable {

    public ResizableCircle(float radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius*(percent/100);
    }
}
