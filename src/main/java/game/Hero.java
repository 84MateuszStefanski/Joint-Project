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
        return overloaded;
    }

    public void showInventory(){
        for (InventoryObject object:inventory){
            System.out.println(object);
        }
//        Arrays.stream(inventory)
//                .forEach(System.out::println);
    }

    public void addItem(InventoryObject inventoryObject){
        for (int i = 0; i< inventory.length;i++){
           if(inventory[i] == null || inventoryWeigth < 100){
                if (inventory[i].equals(inventoryObject)){
                    inventory[i].setCount(inventory[i].getCount()+1);
                    inventoryWeigth += inventoryObject.getWeigth();
                }else{
                    inventory[i] = inventoryObject;
                    inventoryWeigth += inventoryObject.getWeigth();
                }
            }else {
               overloaded = true;
               System.out.println("Overload !!! To much inventory");
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

