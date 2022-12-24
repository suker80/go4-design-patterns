package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

public class Client {

    public static void main(String[] args) {
        Component doranBlade = new Item("도란검", 450);
        Component healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);
        doranBlade.printPrice();
        healPotion.printPrice();

        bag.printPrice();

    }

}
