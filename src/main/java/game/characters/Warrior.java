package game.characters;

import game.items.Armor;
import game.items.Weapon;

public class Warrior extends Hero {
    private Weapon weapon;
    private Armor armor;
    private BodyPart bodyPart;

    public Warrior(String name, String race, Weapon weapon, Armor armor) {
        super(name, race);
        this.weapon = weapon;
        this.armor = armor;
        this.bodyPart = bodyPart;
    }

    public Warrior(String name, String race) {
        super(name, race);
        this.weapon = weapon;
        this.armor = armor;
        this.bodyPart = bodyPart;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

}
