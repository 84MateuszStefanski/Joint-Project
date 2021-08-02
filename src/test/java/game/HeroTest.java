package game;

import game.characters.Hero;
import game.items.InventoryObject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HeroTest {

    @Test
    void shouldAddItem() {

        //given
        Hero hero = new Hero("Ezio","Assasin");
        InventoryObject inventoryObject1 = new InventoryObject("Sword",20.0);

        //when
        hero.addItem(inventoryObject1);

        //then

        assertThat(hero.getInventory().length).isEqualTo(10);
        assertThat(hero.getInventory()[0].getName().equals("Sword"));
        assertThat(hero.getInventory()).isNotEmpty();

    }
}