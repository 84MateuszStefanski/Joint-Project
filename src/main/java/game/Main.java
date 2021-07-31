package game;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Ezio","Assasin");
        InventoryObject inventoryObject1 = new InventoryObject("Sword",55.0);
        InventoryObject inventoryObject2 = new InventoryObject("Bow",45.0);
        InventoryObject inventoryObject3 = new InventoryObject("Knife",1.0);

        hero.addItem(inventoryObject1);
        hero.addItem(inventoryObject2);
        hero.addItem(inventoryObject3);


    }
}
