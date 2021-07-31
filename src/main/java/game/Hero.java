package game;

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

   // public boolean compareItems(InventoryObject inventoryObject) {
//        try {
//            for (int i = 0; i < inventory.length; i++) {
//                    if (inventory[i].getName().equals(inventoryObject.getName())
//                            && inventory[i].getWeigth() == inventoryObject.getWeigth()) ;
//                    return true;
//            }
//        } catch (NullPointerException e) {
//            return false;
//        }
//        return false;
//    }

    public boolean isThereFreePlaceInInventory() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                return true;
            }
        }
        return false;
    }


    public void addItem(InventoryObject inventoryObject) {

        if (isOverloaded()) {
            System.out.println("Overload !!! To much inventory");
        }
        if (inventoryWeigth + inventoryObject.getWeigth() > 100) {
            System.out.println("Cannot add item it will be to much weigth");
        }

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i]!=null&&inventory[i].equals(inventoryObject)){
                inventory[i].setCount(inventory[i].getCount() + 1);
                inventoryWeigth += inventoryObject.getWeigth();
                System.out.println(inventoryObject.getName() + " The same item added to inventory");
                break;
            }
            else {
                if (inventory[i]==null){
                    inventory[i] = inventoryObject;
                    inventoryWeigth += inventoryObject.getWeigth();
                    System.out.println(inventoryObject.getName() + " Added to inventory");
                    break;
            }
            }
        }

//        else if (compareItems(inventoryObject)) {
//            for (int i = 0; i < inventory.length; i++) {
//                inventory[i].setCount(inventory[i].getCount() + 1);
//                inventoryWeigth += inventoryObject.getWeigth();
//                System.out.println(inventoryObject.getName() + " The same item added to inventory");
//                break;
//            }
//        } else if (compareItems(inventoryObject) == false && isThereFreePlaceInInventory()) {
//            for (int i = 0; i < inventory.length; i++) {
//                if (inventory[i]==null){
//                inventory[i] = inventoryObject;
//                inventoryWeigth += inventoryObject.getWeigth();
//                System.out.println(inventoryObject.getName() + " Added to inventory");
//                break;
//            }}
//        }

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

