package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

public class App {

    public static void main(String[] args) {
        Champion kdaAhri = new Ahri(new KDA());
        kdaAhri.move();
        kdaAhri.skillE();

        Champion poolPartyAkali = new Akali(new PoolParty());
        poolPartyAkali.skillE();
        poolPartyAkali.skillQ();
    }
}
