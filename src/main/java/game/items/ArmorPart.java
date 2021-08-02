package game.items;

public class ArmorPart extends InventoryObject {

    private int damageResistance;
    private String bodyPart;

    public ArmorPart(String name, double weigth, int count, int damageResistance, String bodyPart) {
        super(name, weigth, count);
        this.damageResistance = damageResistance;
        this.bodyPart = bodyPart;
    }

    public ArmorPart(String name, double weigth, int damageResistance, String bodyPart) {
        super(name, weigth);
        this.damageResistance = damageResistance;
        this.bodyPart = bodyPart;
    }
}
