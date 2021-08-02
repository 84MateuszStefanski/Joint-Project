package game.items;

public class Food extends InventoryObject {

    private int healthPointsRegeneration;

    public Food(String name, double weigth, int count, int healthPointsRegeneration) {
        super(name, weigth, count);
        this.healthPointsRegeneration = healthPointsRegeneration;
    }

    public Food(String name, double weigth, int healthPointsRegeneration) {
        super(name, weigth);
        this.healthPointsRegeneration = healthPointsRegeneration;
    }

    public int getHealthPointsRegeneration() {
        return healthPointsRegeneration;
    }
}
