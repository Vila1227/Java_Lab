
package com.mycompany.item;
public class Practicalno2 {

    public static void main(String[] args) {
      
        Item item = new Item(10, "item1");
        System.out.println("Item description " + item.getDescription());
        System.out.println("Item location " + item.getLocation());

        Monster monster = new Monster(200, "monster1");
        System.out.println("Monster1 description " + monster.getDescription());
        System.out.println("Monster1 location " + monster.getLocation());
    }
}

    

