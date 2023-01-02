package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Font {
    private final String family;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    private final int  size;

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
