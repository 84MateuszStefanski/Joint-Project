package game;

import java.util.Arrays;

public class Hero {

    private String name;
    private String race;
    private int currentHealth;
    private InventoryObject[] inventory = new InventoryObject[10];
    private boolean overloaded;
    private int inventoryWeigth;

    public Hero(String name, String race) {
        this.name = name;
        this.race = race;
        this.currentHealth = 100;
        this.inventory = inventory;
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

    public InventoryObject[] getInventory() {
        return inventory;
    }

    public boolean isOverloaded() {
        if (inventoryWeigth<=100){
            overloaded = false;
        }else {
            overloaded = true;
        }

        return overloaded;
    }

    public void showInventory(){
        for (InventoryObject object:inventory){
            if(object!=null)
            System.out.println(object);
        }
    }

    public boolean compareItems(InventoryObject inventoryObject){
        try{for (int i = 0; i < inventory.length; i++) {
           if (inventory[i].getName().equals(inventoryObject.getName())
                    && inventory[i].getWeigth() == inventoryObject.getWeigth());
           return true;
        }}catch (NullPointerException e){
          e.getCause();
        }
        return false;
    }

    public boolean isThereFreePlaceInInventory(){
        for (int i=0;i<inventory.length;i++){
            if(inventory[i] == null){
                return true;
            }
        }return false;
    }


    public void addItem(InventoryObject inventoryObject) {

        if (isOverloaded()) {
            System.out.println("Overload !!! To much inventory");
        }else if (inventoryWeigth+inventoryObject.getWeigth()>=100){
            System.out.println("Cannot add item it will be to much weigth");
            }else {
            for (int i = 0; i < inventory.length; i++) {
                if (isThereFreePlaceInInventory()) {
                    if (compareItems(inventoryObject)) {
                        inventory[i].setCount(inventory[i].getCount() + 1);
                        inventoryWeigth += inventoryObject.getWeigth();
                        break;
                    } else {
                        inventory[i] = inventoryObject;
                        inventoryWeigth += inventoryObject.getWeigth();
                        break;
                    }
                }else {
                    System.out.println("Inventory full");
                }
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

