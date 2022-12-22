package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.Anchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();


}
