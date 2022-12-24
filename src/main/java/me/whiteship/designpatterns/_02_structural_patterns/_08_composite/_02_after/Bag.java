package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private final List<Component> items = new ArrayList<>();

    public void add(Component item) {
        items.add(item);
    }

    public List<Component> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Component::getPrice).sum();
    }

    public void printPrice(){
        System.out.println(getPrice());
    }
}
