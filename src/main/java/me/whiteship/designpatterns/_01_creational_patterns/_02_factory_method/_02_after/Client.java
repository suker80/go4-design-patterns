package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().createShip();

        Ship blackShip = new BlackShipFactory().createShip();
        System.out.println(whiteShip);
        System.out.println(blackShip);

    }

}
