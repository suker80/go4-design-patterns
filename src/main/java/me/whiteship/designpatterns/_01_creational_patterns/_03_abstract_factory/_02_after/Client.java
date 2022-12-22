package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShipFactory;

public class Client {
    public static void main(String[] args) {
        Ship ship = new WhiteshipFactory(new WhiteShipPartsFactory()).createShip();
        System.out.println(ship);

    }
}
