package game.items;

public class ArmorPart extends InventoryObject {

    private int damageResistance;
    private BodyPart bodyPart;

    public ArmorPart(String name, double weigth, int count, int damageResistance, BodyPart bodyPart) {
        super(name, weigth, count);
        this.damageResistance = damageResistance;
        this.bodyPart = bodyPart;
    }

    public ArmorPart(String name, double weigth, int damageResistance, BodyPart bodyPart) {
        super(name, weigth);
        this.damageResistance = damageResistance;
        this.bodyPart = bodyPart;
    }
}
