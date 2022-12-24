package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

public  class DefaultChampion implements Champion {
    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    private final Skin skin;
    private final String name;

    @Override
    public void move() {
        System.out.printf("%s %s move\n",skin.getName(),name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s skillQ\n",skin.getName(),name);

    }

    @Override
    public void skillW() {
        System.out.printf("%s %s skillW\n",skin.getName(),name);

    }

    @Override
    public void skillE() {
        System.out.printf("%s %s skillE\n",skin.getName(),name);

    }

    @Override
    public void skillR() {
        System.out.printf("%s %s skillR\n",skin.getName(),name);

    }
}
