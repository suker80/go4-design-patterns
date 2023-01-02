package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Character {

    private char value;

    private String color;

    private Font fontFamily;


    public Character(char value, String color, Font fontFamily) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
    }
}
