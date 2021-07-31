package game;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Ezio","Assasin");
        InventoryObject inventoryObject1 = new InventoryObject("Sword",20.0);
        InventoryObject inventoryObject2 = new InventoryObject("Bow",15.0);
        InventoryObject inventoryObject3 = new InventoryObject("Knife",1.0);

        hero.addItem(inventoryObject1);
        hero.addItem(inventoryObject1);
        hero.addItem(inventoryObject3);

        System.out.println(hero.getInventoryWeigth());

        System.out.println(inventoryObject1.equals(inventoryObject2));

        hero.addItem(inventoryObject2);
        System.out.println(hero.getInventoryWeigth());

        hero.showInventory();



    }
}
