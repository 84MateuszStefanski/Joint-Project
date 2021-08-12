package game.characters;

import game.items.Armor;
import game.items.BodyPart;
import game.items.Weapon;

public class Warrior extends Hero {
    private Weapon weapon;
    private Armor armor;


    public Warrior(String name, String race, Weapon weapon, Armor armor) {
        super(name, race);
        this.weapon = weapon;
        this.armor = armor;
    }

    public Warrior(String name, String race) {
        super(name, race);
        this.weapon = weapon;
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

}
