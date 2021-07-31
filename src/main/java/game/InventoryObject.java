package game;

public class InventoryObject {

    private String name;
    private double weigth;
    private int count;

    public InventoryObject(String name, double weigth, int count) {
        this.name = name;
        this.weigth = weigth;
        this.count = count;
    }

    public InventoryObject(String name, double weigth) {
        this.name = name;
        this.weigth = weigth;
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
