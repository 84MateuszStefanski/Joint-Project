package game.characters;

import game.items.Food;
import game.items.InventoryObject;
import game.items.Weapon;

import java.util.Arrays;

public class Hero {

    private final String name;
    private final String race;
    private int currentHealth;
    private InventoryObject[] inventory;
    private boolean overloaded;
    private int inventoryWeigth;

    public Hero(String name, String race) {
        this.name = name;
        this.race = race;
        this.currentHealth = 100;
        this.inventory = new InventoryObject[10];
        this.overloaded = false;
        this.inventoryWeigth = 0;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getInventoryWeigth() {
        return inventoryWeigth;
    }

    public InventoryObject[] getInventory() {
        return inventory;
    }

    public boolean isOverloaded() {
        if (inventoryWeigth <= 100) {
            overloaded = false;
        } else {
            overloaded = true;
        }

        return overloaded;
    }

    public void showInventory() {
        for (InventoryObject object : inventory) {
            if (object != null)
                System.out.println(object);
        }
    }

    public void addItem(InventoryObject inventoryObject) {

        if (isOverloaded()) {
            System.out.println("Overload !!! To much inventory");
        }
        if (inventoryWeigth + inventoryObject.getWeigth() > 100) {
            System.out.println("Cannot add item it will be to much weigth");
        }

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].equals(inventoryObject)) {
                inventory[i].setCount(inventory[i].getCount() + 1);
                inventoryWeigth += inventoryObject.getWeigth();
                System.out.println(inventoryObject.getName() + " The same item added to inventory");
                break;
            } else {
                if (inventory[i] == null) {
                    inventory[i] = inventoryObject;
                    inventoryWeigth += inventoryObject.getWeigth();
                    System.out.println(inventoryObject.getName() + " Added to inventory");
                    break;
                }
            }
        }
    }

    public void receivingDamage(Weapon weapon){
        currentHealth -= weapon.getDamagePoints();
        System.out.println("You get " + weapon.getDamagePoints() + " points of damage");
        System.out.println("You have " + currentHealth + " health points left ");
    }

    public void eatToRegenerate(){
        for (InventoryObject object : inventory){
            if (object instanceof Food){
                Food food = (Food) object;
                currentHealth += food.getHealthPointsRegeneration();
            } else {
                System.out.println("No food to eat !");
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", currentHealth=" + currentHealth +
                ", inventory=" + Arrays.toString(inventory) +
                ", overloaded=" + overloaded +
                '}';
    }
}

