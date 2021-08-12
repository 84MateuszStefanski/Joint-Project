package game;

import game.characters.Hero;
import game.characters.Warrior;
import game.items.Food;
import game.items.InventoryObject;
import game.items.Weapon;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Sword",20.0,10);
        Weapon bow = new Weapon("Bow",15.0,5);
        Food bread = new Food("Bread",1.0,10);

        Hero hero = new Warrior("Ezio","Assasin", sword,null);
        Warrior hero2 = new Warrior("Ibra","Fighter", bow,null);

        hero.addItem(sword);
        hero.addItem(sword);
        hero.addItem(bread);

        System.out.println(hero.getInventoryWeigth());

        System.out.println(sword.equals(bow));

        hero.addItem(bow);
        System.out.println(hero.getInventoryWeigth());

        hero.showInventory();

        System.out.println("Health " +  hero.getCurrentHealth());

        hero.receivingDamage(sword);

        System.out.println("Health " +  hero.getCurrentHealth());

        hero.eatToRegenerate();

        hero2.addItem(bow);

        System.out.println("Health " +  hero.getCurrentHealth());
        hero.receivingDamage(hero2.getWeapon());
        System.out.println("Health " +  hero.getCurrentHealth());




    }
}
